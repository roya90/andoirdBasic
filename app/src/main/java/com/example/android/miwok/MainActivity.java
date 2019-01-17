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
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // Defining all the textViews.
        TextView numbersTV = (TextView) findViewById(R.id.numbers);
        numbersTV.setOnClickListener(generalOnClickListener);
        TextView phrasesTV = (TextView) findViewById(R.id.phrases);
        phrasesTV.setOnClickListener(generalOnClickListener);
        TextView familyTV = (TextView) findViewById(R.id.family);
        familyTV.setOnClickListener(generalOnClickListener);
        TextView colorTV = (TextView) findViewById(R.id.colors);
        colorTV.setOnClickListener(generalOnClickListener);
    }

    // generating an onClickListener object and calling the appropriate intent with corresponding
    // textView.

    View.OnClickListener generalOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId()== R.id.numbers){
                Intent intent = new Intent(v.getContext(), Numbers.class);
                startActivity(intent);

            }
            else if (v.getId()== R.id.phrases){
                Intent intent = new Intent(v.getContext(), Pharases.class);
                startActivity(intent);
            }
            else if (v.getId()== R.id.family){
                Intent intent = new Intent(v.getContext(), Family.class);
                startActivity(intent);
            }
            else if (v.getId()== R.id.colors){
                Intent intent = new Intent(v.getContext(), Colors.class);
                startActivity(intent);
            }


        }
    };

}
