package com.hensongeodata.technologies.bottomnavigationwithoutfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

      private View firstView, secondView, thirdView, fourthView;
      private BottomNavigationView navView;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            init();
      }

      private void init(){

            firstView = findViewById(R.id.content_one);
            secondView = findViewById(R.id.content_two);
            thirdView = findViewById(R.id.content_three);
            fourthView = findViewById(R.id.content_four);

            navView = findViewById(R.id.navigation);

            firstView.setVisibility(View.VISIBLE);
            secondView.setVisibility(View.GONE);
            thirdView.setVisibility(View.GONE);
            fourthView.setVisibility(View.GONE);

            navView.setOnNavigationItemSelectedListener(selectedListener);

      }

      private BottomNavigationView.OnNavigationItemSelectedListener selectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                  switch (item.getItemId()){
                        case R.id.navigation_start:
                              firstView.setVisibility(View.VISIBLE);
                              secondView.setVisibility(View.GONE);
                              thirdView.setVisibility(View.GONE);
                              fourthView.setVisibility(View.GONE);
                              return true;
                        case R.id.navigation_step_in:
                              firstView.setVisibility(View.GONE);
                              secondView.setVisibility(View.VISIBLE);
                              thirdView.setVisibility(View.GONE);
                              fourthView.setVisibility(View.GONE);

                              return true;

                        case R.id.navigation_move:
                              firstView.setVisibility(View.GONE);
                              secondView.setVisibility(View.GONE);
                              thirdView.setVisibility(View.VISIBLE);
                              fourthView.setVisibility(View.GONE);

                              return true;

                        case R.id.navigation_fast:
                              firstView.setVisibility(View.GONE);
                              secondView.setVisibility(View.GONE);
                              thirdView.setVisibility(View.GONE);
                              fourthView.setVisibility(View.VISIBLE);

                              return true;

                              default:
                                    firstView.setVisibility(View.VISIBLE);

                  }
                  return false;
            }
      };

}
