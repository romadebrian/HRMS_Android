package com.roma.hrms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.roma.hrms.model.User;
import com.roma.hrms.util.PrefUtil;

public class MainActivity extends AppCompatActivity {

    private TextView greeting;
    private TextView email;
    private Button btnLogout;

    public static void start(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greeting = (TextView) findViewById(R.id.greeting);
        email = (TextView) findViewById(R.id.email);
        btnLogout = (Button) findViewById(R.id.btn_logout);

        User user = PrefUtil.getUser(this, PrefUtil.USER_SESSION);

        greeting.setText(getResources().getString(R.string.greeting, user.getData().getFirstname()));

        //greeting.setText(getResources().getString(R.string.greeting, user.getData().getFirstname()));
        //greeting.setText(getResources().getString(R.string.greeting));
        email.setText(user.getData().getEmail());
        //email.setText(getResources().getString(R.string.email));

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logoutAct();

                LoginActivity.start(MainActivity.this);
                MainActivity.this.finish();
            }
        });
    }

    void logoutAct() {
        PrefUtil.clear(this);
    }
}
