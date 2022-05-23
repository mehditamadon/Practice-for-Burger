package com.example.practiveforassignmnetburger;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
  //  ActivityResultLauncher<Intent> launcher = registerForActivityResult(
    //        new ActivityResultContracts.StartActivityForResult(),
        //    new ActivityResultCallback<ActivityResult>() {
        //        @Override
          //      public void onActivityResult(ActivityResult result) {
           //         Log.d("BenTest","You reach me");
           //         Log.d("BenTest","The data is "+ result.getData().getStringExtra("KEY"));

           //     }
        //    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  //      Thread thread = new Thread() {
    //    public void run () {
   //         System.out.println("Thread Running");
     //   }
   // };



        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   lunchSecondActivity();
                //thread.start();
                TextView tv_show = findViewById(R.id.textView2);

                Handler handler = new Handler();


                Runnable r = new Runnable(){
                    int count = 0;
                    @Override
                    public void run() {
                        while (count <= 10) {
                            tv_show.setText(count + "");
                            count++;
                            handler.postDelayed(this, 500);
                        }
                    }
                    };

                handler.post(r);

               // Thread t = new Thread(r);
               //  t.start();
            }
        });


    }
    public void lunchSecondActivity(){
        Student Ben = new Student( "Ben", 21, "fishing");
        Student Mehdi = new Student( "Mehdi", 39, "Android assignment");
        Intent intent = new Intent (this,SecondActivity.class);
        intent.putExtra("Ben_KEY",Ben);
        intent.putExtra("Mehdi_KEY",Mehdi);
      //  launcher.launch(intent);

       // startActivity(intent);


    }
}
