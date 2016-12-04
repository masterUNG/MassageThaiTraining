package rtc.chanisa.kanokporn.massagethaitraining;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetail extends AppCompatActivity {

    //Explicit
    private int index;
    private ImageView topImageView, bottonImageView;
    private TextView topTextView, bottonTextView;
    private int[] ints = new int[2];
    private String[] strings = new String[2];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        bindWidget();

        index = getIntent().getIntExtra("Index", 0);
        Log.d("2decV1", "index ==> " + index);

        chooseData();


    }   // Main Method

    private void chooseData() {
        switch (index) {
            case 0:
                ints[0] = R.drawable.arm1;
                ints[1] = R.drawable.arm2;
                strings[0] = "ผู้ถูกนวด  นั่งอยู่ด้านหน้าผู้นวด (หันหน้าออก)ผู้นวด  นั่งอยู่ด้านหลังคนไข้ ";
                strings[1] = "วิธีการนวด ใช้นิ้วหัวแม่มือกดเส้นกล้ามเนื้อที่คอ กดไล่เรียงไปด้านบนชิดฐานกะโหลก กดผู้นวดจะต้องใช้มือด้านที่อยู่ฝั่งตรงข้ามกับคอด้านที่จะกด และตั้งเข่าตรงข้ามกับมือด้านที่ใช้กด มืออีกข้างประคองที่หน้าผาก กดนวดขึ้นด้านบนอย่างเดียวไม่กดนวดลง";
                break;
            case 1:
                ints[0] = R.drawable.back1;
                ints[1] = R.drawable.back2;
                strings[0] = "";
                strings[1] = "";
                break;
            case 2:
                ints[0] = R.drawable.foot1;
                ints[1] = R.drawable.foot2;
                strings[0] = "";
                strings[1] = "";
                break;
            case 3:
                ints[0] = R.drawable.arm1;
                ints[1] = R.drawable.arm1;
                strings[0] = "";
                strings[1] = "";
                break;
            case 4:
                ints[0] = R.drawable.arm1;
                ints[1] = R.drawable.arm1;
                strings[0] = "";
                strings[1] = "";
                break;
            case 5:
                ints[0] = R.drawable.arm1;
                ints[1] = R.drawable.arm1;
                strings[0] = "";
                strings[1] = "";
                break;
        }

        topImageView.setImageResource(ints[0]);
        bottonImageView.setImageResource(ints[1]);
        topTextView.setText(strings[0]);
        bottonTextView.setText(strings[1]);

    }

    private void bindWidget() {
        topImageView = (ImageView) findViewById(R.id.imageView8);
        bottonImageView = (ImageView) findViewById(R.id.imageView9);
        topTextView = (TextView) findViewById(R.id.textView9);
        bottonTextView = (TextView) findViewById(R.id.textView10);
    }

    public void clickBack(View view) {
        finish();
    }

}   // Main Class
