package lt.vtvpmc.ems.teleloto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 1; i <= 75; i++) {
                    list.add(i);
                }
                Collections.shuffle(list);

                ArrayList<Integer> choose = new ArrayList<>();
                for (int i = 1; i < 6; i++) {
                    choose.add(list.get(i));
                }

                Collections.sort(choose);

                StringBuilder sb = new StringBuilder();
                for (int i:choose){
                    sb.append(String.valueOf(i));
                    sb.append(", ");
                }

                textView.setText(sb.toString().replaceAll(", $", ""));
            }
        });
    }
}
