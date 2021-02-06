package com.example.stocks;

import android.nfc.Tag;
import android.util.Log;

public class PerceptronStocks {

    public static final int NUM_VALUE = 1;
    public static int NUM_ENTERS;
    public static int NUM_DAYS;
    public static int MAX_ITERATIONS;
    public static float[] results;

    double[] enters;
    //double[] hidden;
    double[] outer;
    //double[][] wEH;
    //double[] wHO;
    double[][] weights;
    double[] outer_max;
    String tag = "MyTag";
    int[][] patterns;
    int[] answers;

    public PerceptronStocks(int NUM_DAYS, int NUM_ENTERS, int MAX_ITERATIONS, float[] results) {

        this.NUM_DAYS = NUM_DAYS;
        this.NUM_ENTERS = NUM_ENTERS;
        this.MAX_ITERATIONS = MAX_ITERATIONS;
        this.results = results;
        answers = new int[NUM_DAYS-NUM_ENTERS-1];
        patterns = new int[NUM_DAYS-NUM_ENTERS-1][NUM_ENTERS];

        for(int i=0;i<(NUM_DAYS-NUM_ENTERS-1);i++){
            if(results[i+NUM_ENTERS+1]>results[i+NUM_ENTERS])
                answers[i] = 1;
            else answers[i] = 0;
            Log.d("MyTag", "\nanswers[" + i + "] = "+ answers[i] + "\n");
            for(int j=0;j<NUM_ENTERS;j++){
                if((j+i-1>=0)&&(results[j+i]>results[j+i-1]))
                    patterns[i][j] = 1;
                else patterns[i][j] = 0;
                Log.d("MyTag", "patterns[" + i + "] [" + j + "] = "+ patterns[i][j]);
            }
        }

        enters = new double[NUM_ENTERS];
        weights = new double[NUM_VALUE][enters.length];
        for(int num = 0; num <NUM_VALUE;num++) {
            for (int i = 0; i < enters.length; i++) {
                weights[num][i] = Math.random() * 0.02 + 0.01;
                enters[i] = 0;
            }
        }
        outer = new double[NUM_VALUE];
        outer_max = new double[NUM_VALUE];
    }

    void countOuter(){
        for(int num=0;num<NUM_VALUE;num++) {
            outer[num] = 0;
            for (int i = 0; i < enters.length; i++) {
                outer[num] += enters[i] * weights[num][i];
            }
            if (outer[num]>=0.5) {
                outer_max[num] = outer[num];
                outer[num] = 1;
            }
            else{
                outer_max[num] = outer[num];
                outer[num] = 0;
            }
        }
    }

    int study(){
        int iterations = 0;
        double gError;
        for(int num=0;num<NUM_VALUE;num++) {
            do {
                iterations++;
                gError = 0;
                for (int p = 0; p < (patterns.length); p++) {
                    for (int i = 0; i < enters.length; i++) {
                        enters[i] = patterns[p][i];
                    }
                    countOuter();
                    Log.d(tag,"Outer = " + outer[num]);
                    //iterations++;
                    double error = answers[p] - outer[num];
                    gError += Math.abs(error);
                    for (int i = 0; i < enters.length; i++) {
                        weights[num][i] += 0.1 * error * enters[i];
                    }
                    //Log.d(tag, "eror = " + error);
                    //Log.d(tag, "gEror = " + gError);
                }
                Log.d(tag, "iterations = " + iterations + " gEror = " + gError);
                if (iterations>MAX_ITERATIONS) break;
            } while (gError > ((NUM_DAYS-NUM_ENTERS-1)*0.3));
        }
        return (iterations);
    }

    void studyWrong(int num){
        Integer Num = num;
        if(Num == -1) return;
        for(int i=0;i<enters.length;i++){
            if (enters[i]==1) weights[Num][i] -= 0.01;
        }
        countOuter();
    }

    void studyWright(int num){
        Integer Num = num;
        if(Num == -1) return;
        for(int i=0;i<enters.length;i++){
            if (enters[i]==1) weights[Num][i] += 0.01;
        }
        countOuter();
    }

}
