/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numberTV = (TextView) findViewById(R.id.numbers);
        numberTV.setOnClickListener(generalActivityListener);

        TextView phrasesTV = (TextView) findViewById(R.id.phrases);
        phrasesTV.setOnClickListener(generalActivityListener);

        TextView familyTV= (TextView) findViewById(R.id.family);
        familyTV.setOnClickListener(generalActivityListener);

        TextView colorTV= (TextView) findViewById(R.id.colors);
        colorTV.setOnClickListener(generalActivityListener);
    }
//
//    public void startNumber (View view){
//
//
//
//    }
//    View.OnClickListener numberActivityListener = new View.OnClickListener(){
//        @Override
//        public void onClick (View v){
//            startNumber(v);
//        }
//    };
//
//
//    View.OnClickListener phrasesActivityListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//        }
//    };
//


    View.OnClickListener generalActivityListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (v.getId()== R.id.family){
                Intent intentFamily = new Intent(MainActivity.this, Family.class);
                startActivity(intentFamily);


            }
            else if (v.getId()==R.id.colors){
                Intent intentColor= new Intent (MainActivity.this, Colors.class);
                startActivity(intentColor);

            }
            else if (v.getId()==R.id.phrases){
                Intent intentPhrases = new Intent(MainActivity.this, Pharases.class);
                startActivity(intentPhrases);

            }
            else if (v.getId()==R.id.numbers){
                Intent intentNumber = new Intent(MainActivity.this,Numbers.class);
                startActivity(intentNumber);

            }


        }
    };




}
