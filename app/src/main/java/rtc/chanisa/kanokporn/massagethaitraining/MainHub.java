package rtc.chanisa.kanokporn.massagethaitraining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainHub extends AppCompatActivity implements View.OnClickListener {

    private ImageView hub1ImageView, hub2ImageView, hub3ImageView,
            hub4ImageView, hub5ImageView, hub6ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hub);

        //Bind Widget
        hub1ImageView = (ImageView) findViewById(R.id.imageView2);
        hub2ImageView = (ImageView) findViewById(R.id.imageView3);
        hub3ImageView = (ImageView) findViewById(R.id.imageView4);
        hub4ImageView = (ImageView) findViewById(R.id.imageView5);
        hub5ImageView = (ImageView) findViewById(R.id.imageView6);
        hub6ImageView = (ImageView) findViewById(R.id.imageView7);

        //Image Controller
        hub1ImageView.setOnClickListener(this);
        hub2ImageView.setOnClickListener(this);
        hub3ImageView.setOnClickListener(this);
        hub4ImageView.setOnClickListener(this);
        hub5ImageView.setOnClickListener(this);
        hub6ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    } // Main Method

    @Override
    public void onClick(View view) {

        int i = 0;

        switch (view.getId()) {

            case R.id.imageView2:
                i = 0;
                break;
            case R.id.imageView3:
                i = 1;
                break;
            case R.id.imageView4:
                i = 2;
                break;
            case R.id.imageView5:
                i = 3;
                break;
            case R.id.imageView6:
                i = 4;
                break;

        }   // switch

        Intent intent = new Intent(MainHub.this, ShowDetail.class);
        intent.putExtra("Index", i);
        startActivity(intent);

    }   // onClick
}   // Main Class
