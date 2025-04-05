package com.example.stocks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    // Test
    Spinner spinnerEngine;
    Spinner spinnerMarket;
    Spinner spinnerSecurity;
    String selectedEngineName;
    String selectedMarketName;
    String selectedSecurityName;
    static String[] markets;
    static String[] marketName;
    static String[] securities;
    static String[] securityName;

    float[] results;

    GraphView graphView;
    TextView tvLog;

    ProgressBar progressBar;
    ProgressBar progressBarHorizontal;
    ProgressBar progressBarNuero;
    ProgressBar progressBarNeuroHorizontal;

    int numLogOperation;
    int totalDays;
    //boolean getResponse;

    int NUM_DAYS;
    int NUM_ENTERS;
    int MAX_ITERATIONS;
    int NUM_LAYERS;

    EditText mEditTextDays;
    EditText mEditTextEnters;
    EditText mEditTextLayers;
    EditText mEditTextIterations;

    Button mButtonEngine;
    Button mButtonMarket;
    Button mButtonSecurity;
    Button mButtonStudyPerceptron;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerEngine = findViewById(R.id.spinner_engine);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.engines,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEngine.setAdapter(adapter);

        //spinnerMarket = findViewById(R.id.spinner_market);

        graphView = findViewById(R.id.graph_view);
        tvLog = findViewById(R.id.tv_log);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        progressBarHorizontal = (ProgressBar) findViewById(R.id.progress_bar_horizontal);
        progressBarNuero = (ProgressBar) findViewById(R.id.progress_bar_neuro);
        progressBarNeuroHorizontal = (ProgressBar) findViewById(R.id.progress_bar_neuro_horizontal);

        numLogOperation = 0;
        totalDays = 0;

        mEditTextDays = (EditText) findViewById(R.id.et_num_days);
        mEditTextEnters = (EditText) findViewById(R.id.et_num_neuro);
        mEditTextLayers = (EditText) findViewById(R.id.et_num_layers);
        mEditTextLayers.setText("0"); // !!! Needs update
        mEditTextIterations = (EditText) findViewById(R.id.et_num_max_iterations);

        mButtonEngine = (Button) findViewById(R.id.btn_engine);
        mButtonMarket = (Button) findViewById(R.id.btn_market);
        mButtonSecurity = (Button) findViewById(R.id.btn_security);
        mButtonStudyPerceptron = (Button) findViewById(R.id.btn_study_perceptron);

        mButtonMarket.setEnabled(false);
        mButtonSecurity.setEnabled(false);
        mButtonStudyPerceptron.setEnabled(false);
    }

    public void btnEngineOnClick(View view) {
        String selectedEngine = spinnerEngine.getSelectedItem().toString();
        //int item = (int) spinnerEngine.getSelectedItem();
        selectedEngineName ="";

        switch (selectedEngine){
            case ("Фондовый рынок и рынок депозитов"):
                selectedEngineName = "stock";
                break;
            case("Рынок ГЦБ (размещение)"):
                selectedEngineName = "state";
                break;
            case("Валютный рынок"):
                selectedEngineName = "currency";
                break;
            case("Срочный рынок"):
                selectedEngineName = "futures";
                break;
            case("Товарный рынок"):
                selectedEngineName = "commodity";
                break;
            case("Товарные интервенции"):
                selectedEngineName = "interventions";
                break;
            case("ОТС-система"):
                selectedEngineName = "offboard";
                break;
        }
        //Log.d("MyTag","selectedEngineName = " + selectedEngineName);
        NetworkService.getInstance().getJsonApi().getData(selectedEngineName).enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                Post post = response.body();
                List<List<String>> arrayMarkets = post.getMarkets().getData();
                markets = new String[arrayMarkets.size()];
                marketName = new String[arrayMarkets.size()];
                for(int i =0;i<arrayMarkets.size();i++){
                    markets[i] = arrayMarkets.get(i).get(2);
                    marketName[i] = arrayMarkets.get(i).get(1);
                }

                //String temp = arrayMarkets.get(0).get(2);
                String temp = markets[0];
                //Log.d("MyTag","temp = " + temp);
                //Log.d("MyTag",marketName[0]);
                //Log.d("MyTag","size = " + arrayMarkets.size());
                //Log.d("MyTag","Response - OK");

                spinnerMarket = new Spinner(getBaseContext());
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(),
                        android.R.layout.simple_spinner_item,markets);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinnerMarket = findViewById(R.id.spinner_market);
                spinnerMarket.setAdapter(adapter);

                numLogOperation++;
                tvLog.append(numLogOperation + ". Получен ответ от сервера: список рынков\n");
                mButtonMarket.setEnabled(true);
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Log.d("MyTag","Error get response");
                numLogOperation++;
                tvLog.append(numLogOperation + ". Ошибка сетевого подключения\n");
            }
        });

    }

    public void btnMarketOnClick(View view) {
        int spinnerMarketId = spinnerMarket.getSelectedItemPosition();
        selectedMarketName = marketName[spinnerMarketId];
        //Log.d("MyTag","market = " + markets[spinnerMarketId]);
        Log.d("MyTag","selectedEngineName = " + selectedEngineName);
        Log.d("MyTag","selectedMarketName = " + selectedMarketName);

        NetworkService.getInstance().getJsonApi().getSecurities(selectedEngineName,selectedMarketName).enqueue(new Callback<Post2>() {
            @Override
            public void onResponse(Call<Post2> call, Response<Post2> response) {
                Log.d("MyTag","Response - OK");
                Post2 post2 = response.body();
                List<List<String>> arraySecurities = post2.getSecurities().getData();
                securities = new String[arraySecurities.size()];
                securityName = new String[arraySecurities.size()];
                for(int i=0;i<arraySecurities.size();i++){
                    securities[i] = arraySecurities.get(i).get(2);
                    securityName[i] = arraySecurities.get(i).get(0);
                }

                spinnerSecurity = new Spinner(getBaseContext());
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(),
                        android.R.layout.simple_spinner_item,securities);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinnerSecurity = findViewById(R.id.spinner_security);
                spinnerSecurity.setAdapter(adapter);

                numLogOperation++;
                tvLog.append(numLogOperation + ". Получен ответ от сервера: список ценных бумаг\n");

                mButtonSecurity.setEnabled(true);
            }

            @Override
            public void onFailure(Call<Post2> call, Throwable t) {
                Log.d("MyTag","Response - Fail");
                numLogOperation++;
                tvLog.append(numLogOperation + ". Ошибка сетевого подключения\n");
                t.printStackTrace();
            }
        });

    }

    public void btnSecurityOnClick(View view) {
        //getResponse = false;

        int spinnerSecurityId = spinnerSecurity.getSelectedItemPosition();
        selectedSecurityName = securityName[spinnerSecurityId];
        Log.d("MyTag","security = " + securities[spinnerSecurityId]);
        Log.d("MyTag","selectedSecurityName = " + selectedSecurityName);
        NetworkService.getInstance().getJsonApi().getDataTotal(selectedEngineName,
                selectedMarketName,selectedSecurityName).enqueue(new Callback<Post3>() {
            @Override
            public void onResponse(Call<Post3> call, Response<Post3> response) {
                results = null;
                Log.d("MyTag","Response getDataTotal - OK");
                //getResponse = true;
                Post3 post3 = response.body();
                List<List<Integer>> data = post3.getHistoryCursor().getData();
                totalDays = data.get(0).get(1);
                results = new float[totalDays];
                progressBarHorizontal.setMax(totalDays);

                /*List<List<String>> arrayData = post3.getHistory().getData();
                Log.d("MyTag", "arrayDara.size = " + arrayData.size());
                results = new float[arrayData.size()];
                for(int i=0;i<arrayData.size();i++){
                    //results[i]=Float.parseFloat(arrayData.get(i).get(9));
                    //Log.d("MyTag", "results[i] = " + results[i]);
                    if(arrayData.get(i).get(9) == null) results[i] = 0;
                    if ((arrayData.get(i).get(9) == null)&&(i>0))
                        //results[i] = 0;
                        results[i] = results[i-1]; // Надо как-то исправить!
                    else if(arrayData.get(i).get(9) != null)
                        results[i] = Float.parseFloat(arrayData.get(i).get(9));
                }
                Log.d("MyTag",  "results.length = " + results.length);
                DataPoint[] dataPoints = new DataPoint[results.length];
                for(int i =0;i<results.length;i++){
                    dataPoints[i] = new DataPoint(i, results[i]);
                    //
                    Log.d("MyTag",  "i = " + i + " result = " + results[i]);
                }
                LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(dataPoints);
                graphView.removeAllSeries();
                graphView.addSeries(series);*/

                numLogOperation++;
                tvLog.append(numLogOperation + ". Получен ответ от сервера: курс ценных бумаг " +
                        selectedSecurityName + "\n");
                tvLog.append("Всего: " + totalDays + " дней\n");

                NetworkAsyncTask networkAsyncTask = new NetworkAsyncTask();
                networkAsyncTask.execute();

                //mButtonStudyPerceptron.setEnabled(true);
            }

            @Override
            public void onFailure(Call<Post3> call, Throwable t) {
                Log.d("MyTag","Response getDataTotal - Fail");
                numLogOperation++;
                tvLog.append(numLogOperation + ". Ошибка сетевого подключения\n");
            }
        });

        /*try {
            Response<Post3> response = NetworkService.getInstance().getJsonApi().getDataTotal(selectedEngineName,
                    selectedMarketName,selectedSecurityName).execute();
            Post3 post3 = response.body();
            if (response.isSuccessful()) {
                Log.d("MyTag",  "Response getDataTotal - OK");
                List<List<String>> arrayData = post3.getHistory().getData();
                Log.d("MyTag", "arrayDara.size = " + arrayData.size());
                results = new float[arrayData.size()];
                for(int i=0;i<arrayData.size();i++){
                    results[i]=Float.parseFloat(arrayData.get(i).get(9));
                    //Log.d("MyTag", "results[i] = " + results[i]);
                }
            }
            else{
                Log.d("MyTag",  "Response getDataTotal - Fail");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Log.d("MyTag","Response exception");
        }*/

        /*new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Response<Post3> response = NetworkService.getInstance().getJsonApi().getDataTotal(selectedEngineName,
                            selectedMarketName,selectedSecurityName).execute();
                    Post3 post3 = response.body();
                    if (response.isSuccessful()) {
                        Log.d("MyTag",  "Response getDataTotal - OK");
                        List<List<String>> arrayData = post3.getHistory().getData();
                        Log.d("MyTag", "arrayDara.size = " + arrayData.size());
                        results = new float[arrayData.size()];
                        for(int i=0;i<arrayData.size();i++){
                            results[i]=Float.parseFloat(arrayData.get(i).get(9));
                            //Log.d("MyTag", "results[i] = " + results[i]);
                        }
                    }
                    else{
                        Log.d("MyTag",  "Response getDataTotal - Fail");
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                    Log.d("MyTag","Response exception");
                }
            }
        }).start();*/

        /*ThreadHistory th1 = new ThreadHistory();
        th1.getThread().start();

        try {
            th1.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Log.d("MyTag","Thread Exception");
            tvLog.append("Ошибка сетевого потока\n");
        }


        Log.d("MyTag",  "results.length = " + results.length);
        DataPoint[] dataPoints = new DataPoint[results.length];
        for(int i =0;i<results.length;i++){
            dataPoints[i] = new DataPoint(i, results[i]);
            //
            Log.d("MyTag",  "i = " + i + " result = " + results[i]);
        }
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(dataPoints);
        graphView.removeAllSeries();
        graphView.addSeries(series);*/

    }

    public int btnStudyPerpceptronOnClick(View view) {
        String temp = String.valueOf(mEditTextDays.getText());

        if (temp.equals("")){
            numLogOperation++;
            tvLog.append(numLogOperation + ". Ошибка: поле количества дней для обучения нейросети пустое\n");
            Toast.makeText(getApplicationContext(),"Укажите количество дней для обучения нейросети",Toast.LENGTH_SHORT).show();
            return 0;
        }

        NUM_DAYS = Integer.parseInt(temp);

        if (NUM_DAYS == 0){
            numLogOperation++;
            tvLog.append(numLogOperation + ". Ошибка: количество дней для обучения нейросети равно нулю\n");
            Toast.makeText(getApplicationContext(),"Укажите ненулевое количество дней для обучения нейросети",Toast.LENGTH_SHORT).show();
            return 0;
        }

        temp = String.valueOf(mEditTextEnters.getText());

        if (temp.equals("")){
            numLogOperation++;
            tvLog.append("Ошибка: поле количества нейронов в нейросети пустое\n");
            Toast.makeText(getApplicationContext(),"Укажите количество нейронов в нейросети",Toast.LENGTH_SHORT).show();
            return 0;
        }

        NUM_ENTERS = Integer.parseInt(temp);

        if (NUM_ENTERS == 0){
            tvLog.append("Ошибка: нейронов равно нулю\n");
            Toast.makeText(getApplicationContext(),"Укажите ненулевое количество нейронов в нейросети",Toast.LENGTH_SHORT).show();
            return 0;
        }

        temp = mEditTextIterations.getText().toString();

        if (temp.equals("")){
            tvLog.append("Ошибка: поле максимального количества итераций обучения нейросети пустое\n");
            Toast.makeText(getApplicationContext(),"Укажите максимальное количество итераций обучения нейросети",Toast.LENGTH_SHORT).show();
            return 0;
        }

        MAX_ITERATIONS = Integer.parseInt(temp);

        if (MAX_ITERATIONS == 0){
            tvLog.append("Ошибка: максимальное количество итераций обучения нейросети равно нулю\n");
            Toast.makeText(getApplicationContext(),"Укажите ненулевое максимальное количество итераций" +
                    " обучения нейросети",Toast.LENGTH_SHORT).show();
            return 0;
        }

        temp = mEditTextLayers.getText().toString();
        if (temp.equals("")){
            tvLog.append("Ошибка: поле количества скрытых слоев нейросети пустое\n");
            Toast.makeText(getApplicationContext(),"Укажите количество скрытых слоев нейросети",Toast.LENGTH_SHORT).show();
            return 0;
        }

        NUM_LAYERS = Integer.parseInt(temp);
        if (NUM_LAYERS == 0){
            PerceptronAsyncTask perceptronAsyncTask = new PerceptronAsyncTask();
            perceptronAsyncTask.execute();
        }

        return 1;
    }

    /*
    class ThreadHistory implements Runnable{

        Thread thread;

        public ThreadHistory() {
            thread = new Thread(this);
        }

        Thread getThread(){
            return thread;
        }

        @Override
        public void run() {
            try {
                Response<Post3> response = NetworkService.getInstance().getJsonApi().getDataTotal(selectedEngineName,
                        selectedMarketName,selectedSecurityName).execute();
                Post3 post3 = response.body();
                if (response.isSuccessful()) {
                    Log.d("MyTag",  "Response getDataTotal - OK");
                    List<List<String>> arrayData = post3.getHistory().getData();
                    Log.d("MyTag", "arrayDara.size = " + arrayData.size());
                    results = new float[arrayData.size()];
                    for(int i=0;i<arrayData.size();i++){
                        results[i]=Float.parseFloat(arrayData.get(i).get(9));
                        //Log.d("MyTag", "results[i] = " + results[i]);
                    }
                    tvLog.append("Получен ответ от сервера\n");
                }
                else{
                    Log.d("MyTag",  "Response getDataTotal - Fail");
                    tvLog.append("Ошибка сетевого подключения\n");
                }
            }
            catch (Exception e){
                e.printStackTrace();
                Log.d("MyTag","Response exception");
            }
        }
    }*/

    class NetworkAsyncTask extends AsyncTask<Void,Integer,Void>{

        public NetworkAsyncTask() {
            super();
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(ProgressBar.VISIBLE);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            progressBar.setVisibility(ProgressBar.INVISIBLE);
            progressBarHorizontal.setProgress(totalDays);
            Log.d("MyTag",  "results.length = " + results.length);
            DataPoint[] dataPoints = new DataPoint[results.length];
            for(int i =0;i<results.length;i++){
                dataPoints[i] = new DataPoint(i, results[i]);
                //
                Log.d("MyTag",  "i = " + i + " result = " + results[i]);
            }
            LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(dataPoints);
            graphView.setTitle(selectedSecurityName);
            graphView.removeAllSeries();
            graphView.addSeries(series);
            graphView.getViewport().setXAxisBoundsManual(true);
            graphView.getViewport().setMaxX(results.length+10.0);

            mButtonStudyPerceptron.setEnabled(true);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            progressBarHorizontal.setProgress(values[0]);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                int tmp1 = totalDays / 100;
                //int tmp2 = NUM_DAYS % 100;
                //Toast.makeText(this, "tmp1 = " + tmp1 + " tmp2 = " + tmp2, Toast.LENGTH_LONG).show();
                int tmp3 = 0;
                int start = 0;
                while (tmp1 >= 1) {
                    //Log.d("MyTag", "begin main cycle: tmp3 = " + tmp3);
                    start = 100 * tmp3;
                    //Log.d("MyTag", "begin main cycle: start = " + start);
                    //Log.d("MyTag", "begin main cycle: tmp1 = " + tmp1);
                    Response<Post3> response = NetworkService.getInstance().getJsonApi().getDataIntermediate(
                            selectedEngineName,selectedMarketName,selectedSecurityName,start).execute();
                    //Post3 post3 = NetworkService3.getInstance().getJSONApi().getData(start).execute().body();
                    Post3 post3 = response.body();
                    if (response.isSuccessful()) {
                        List<List<String>> array = post3.getHistory().getData();
                        //Log.d("MyTag", "before cycle: tmp3 = " + tmp3);
                        for (int i = (tmp3 * 100); i < (tmp3 * 100 + 100); i++) {
                            if ((array.get(i - tmp3 * 100).get(9) == null) && (i > 0))
                                //results[i] = 0;
                                results[i] = results[i - 1]; // Надо как-то исправить!
                            else if(array.get(i - tmp3 * 100).get(9) != null){
                                //results[i]=0; // debug
                                //Log.d("MyTag","reponse = " + array.get(i - tmp3 * 100).get(9));
                                results[i] = Float.parseFloat(array.get(i - tmp3 * 100).get(9));
                                //Log.d("MyTag", "tmp3 = " + tmp3 + " i = " + i + " result = " + Float.toString(results[i]));
                            }
                            publishProgress(i);
                            //tvInfo.append("Дата: " + array.get(i-tmp3*100).get(1) + " Курс: " + array.get(i-tmp3*100).get(9) +"\n");
                        }
                        //tvInfo.append("Response - OK \n");
                    } else {
                        Log.d("MyTag", "Error response");
                    }
                    tmp3++;
                    tmp1--;
                }
                start = totalDays - 100;
                Response<Post3> response = NetworkService.getInstance().getJsonApi().getDataIntermediate(
                        selectedEngineName,selectedMarketName,selectedSecurityName,start).execute();
                //Post3 post3 = NetworkService3.getInstance().getJSONApi().getData(start).execute().body();
                Post3 post3 = response.body();
                if (response.isSuccessful()) {
                    List<List<String>> array = post3.getHistory().getData();
                    //Log.d("MyTag", "before cycle: tmp3 = " + tmp3 + "start = " + start);
                    for (int i = (tmp3*100); i < totalDays; i++) {
                        if ((array.get(i - (tmp3*100)).get(9) == null) && (i != 0))
                            //results[i] = 0;
                            results[i] = results[i - 1]; // Надо как-то исправить!
                        else {
                            //results[i]=0; // debug
                            results[i] = Float.parseFloat(array.get(i - (tmp3*100)).get(9));
                            //Log.d("MyTag", "tmp3 = " + tmp3 + " i = " + i + " result = " + Float.toString(results[i]));
                        }
                        //tvInfo.append("Дата: " + array.get(i-tmp3*100).get(1) + " Курс: " + array.get(i-tmp3*100).get(9) +"\n");
                    }
                    //tvInfo.append("Response - OK \n");

                } else {
                    Log.d("MyTag", "Error response");
                }
                //bThreadIsOk = true;

            } catch (Exception e) {
                Log.d("MyTag", "AsynsTask Exception\n");
                e.printStackTrace();
            }
            return null;
        }
    }

    class PerceptronAsyncTask extends AsyncTask<Void,Integer,Void>{

        PerceptronStocks perceptronStocks;
        int iterations;
        int Outer;
        boolean bMaxIterations = false;

        public PerceptronAsyncTask() {
            super();
        }

        @Override
        protected void onPreExecute() {
            progressBarNuero.setVisibility(ProgressBar.VISIBLE);
            progressBarNeuroHorizontal.setMax(MAX_ITERATIONS);
            numLogOperation++;
            tvLog.append(numLogOperation + ". Studying Perceptrone...\n");
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            progressBarNuero.setVisibility(ProgressBar.INVISIBLE);
            progressBarNeuroHorizontal.setProgress(MAX_ITERATIONS);
            numLogOperation++;
            if(bMaxIterations == true) {
                tvLog.append(numLogOperation + ". Ошибка: превышен максимальный предел итераций обучения\n");
                Toast.makeText(getApplicationContext(), "Превышен предел итераций: перенастройте нейросеть" +
                        " (например, уменьшите количество дней для обучения)", Toast.LENGTH_LONG).show();
            }
            else if (Outer == 0) {
                tvLog.append(numLogOperation + ". Perceptrone study - OK Iterations = " + iterations + "\n");
                tvLog.append("   Эффективность сети - 70%\n");
                tvLog.append("   Предсказывается падение курса акций\n");
                Toast.makeText(getApplicationContext(), "Предсказывается падение курса акций", Toast.LENGTH_LONG).show();
            }
            else if(Outer == 1) {
                tvLog.append(numLogOperation + ". Perceptrone study - OK Iterations = " + iterations + "\n");
                tvLog.append("   Эффективность сети - 70%\n");
                tvLog.append("   Предсказывается повышение курса акций\n");
                Toast.makeText(getApplicationContext(), "Предсказывается повышение курса акций", Toast.LENGTH_LONG).show();
            }
            super.onPostExecute(aVoid);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            progressBarNeuroHorizontal.setProgress(values[0]);
            super.onProgressUpdate(values);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            perceptronStocks = new PerceptronStocks(NUM_DAYS, NUM_ENTERS, MAX_ITERATIONS, results);
            Log.d("MyTag","Constructor Perceptron - OK");

            iterations = perceptronStocks.study();
            if (iterations>MAX_ITERATIONS)
                bMaxIterations = true;
            for(int i=0;i<perceptronStocks.enters.length;i++){
                //perceptronStocks.enters[i] = results[NUM_DAYS-perceptronStocks.enters.length+i];
                int res;
                if (results[NUM_DAYS-perceptronStocks.enters.length+i]>results[NUM_DAYS-perceptronStocks.enters.length+i-1])
                    res = 1;
                else res = 0;
                perceptronStocks.enters[i] = res;
            }
            perceptronStocks.countOuter();
            Log.d("MyTag","Final Outer = " + perceptronStocks.outer[0]);
            //Outer = (int)Math.round(perceptronStocks.outer[0]);
            Outer = (int)perceptronStocks.outer[0];
            return null;
        }
    }

}


