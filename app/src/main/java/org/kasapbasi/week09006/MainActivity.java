package org.kasapbasi.week09006;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    String in="{ \"sys\":  { \"country\":\"GB\",  \"sunrise\":1381107633, \"sunset\":1381149604 } }";
    String in2="{\"cars\":[ \"Ford\", \"BMW\", \"Fiat\" ]}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            JSONObject reader = new JSONObject(in);
            JSONObject sys  = reader.getJSONObject("sys");
             Log.d("SYS:country",sys.getString("country"));
             Log.d("SYS:sunRise",sys.getString("sunrise"));
             Log.d("SYS:sunSet",sys.getString("sunset"));
            JSONObject myArr= new JSONObject(in2);

            JSONArray cars = myArr.getJSONArray("cars");
            for (int i = 0; i < cars.length(); i++) {
                //JSONObject c = cars.getJSONObject(i);
                Log.d("CARS", cars.get(i).toString());
            }
        }catch (JSONException e){

            Log.d("ERROR LOO",e.getMessage());
        }
    }
}
