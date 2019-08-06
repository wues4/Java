package com.domain.wues.apptools;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

public class BackgroundOperation extends AsyncTask<Void, Void, String> {

    private Activity activity;
    private ProgressBar progressBar;
    private EditText whichPrime;

    public BackgroundOperation(Activity activity){
        this.activity = activity;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        whichPrime = activity.findViewById(R.id.primeNumET);
        progressBar = activity.findViewById(R.id.primeNumPB);
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected String doInBackground(Void...params) {
        return primeNumCalculate();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        progressBar.setVisibility(View.INVISIBLE);

    }

    private boolean isPrime(int n){
        for (int i = 2; i<n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    private String primeNumCalculate(){
        int which = Integer.parseInt(whichPrime.getText().toString());
        if (which>10000) {
            which = 10000;
        }

        int m = 0;
        int candidate = 1;
        while (m<=which) {
            if ((isPrime(candidate))) {
                m++;
                candidate++;
            }
            else
                candidate++;
        }
        candidate--;
        String result = which + " -> " + candidate;
        Snackbar.make(activity.getCurrentFocus(), result, Snackbar.LENGTH_INDEFINITE).show();
        return result;
    }
}
