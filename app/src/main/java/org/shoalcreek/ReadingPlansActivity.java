package org.shoalcreek;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReadingPlansActivity extends AppCompatActivity {

    private ReadingPlansViewAdapter adapter;
    private List<SpecialExpandModel> models;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_plans);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        init();

    }

    private void init(){

        models = new ArrayList<>();

        SpecialExpandModel model1 = new SpecialExpandModel();
        model1.setQuestion("Quick path through the New Testament");

        List<String> answers1 = new ArrayList<>();
        answers1.add("Genesis 1:1-31");
        answers1.add("Genesis 3:1-24");
        answers1.add("Genesis 6:9-22");
        answers1.add("Exodus 20:1-21");
        answers1.add("Leviticus 4:1-35");
        answers1.add("Isaiah 53");
        answers1.add("Hosea 3:1-5");
        answers1.add("Luke 1:26-38, 2:1-20");
        answers1.add("Luke 5:17-26");

        model1.setAnswer(answers1);

        SpecialExpandModel model2 = new SpecialExpandModel();
        model2.setQuestion("Trust A (Creation to Christ pt. 1)");

        List<String> answers2 = new ArrayList<>();
        model2.setAnswer(answers2);

        SpecialExpandModel model3 = new SpecialExpandModel();
        model3.setQuestion("Trust B (Creation to Christ pt. 2)");

        List<String> answers3 = new ArrayList<>();
        model3.setAnswer(answers3);

        SpecialExpandModel model4 = new SpecialExpandModel();
        model4.setQuestion("Obey");

        List<String> answers4 = new ArrayList<>();
        model4.setAnswer(answers4);

        SpecialExpandModel model5 = new SpecialExpandModel();
        model5.setQuestion("Share");

        List<String> answers5 = new ArrayList<>();
        model5.setAnswer(answers5);

        SpecialExpandModel model6 = new SpecialExpandModel();
        model6.setQuestion("Relate");

        List<String> answers6 = new ArrayList<>();
        model6.setAnswer(answers6);


        SpecialExpandModel model7 = new SpecialExpandModel();
        model7.setQuestion("Serve");

        List<String> answers7 = new ArrayList<>();
        model7.setAnswer(answers7);

        SpecialExpandModel model8 = new SpecialExpandModel();
        model8.setQuestion("Give");


        List<String> answers8 = new ArrayList<>();
        model8.setAnswer(answers8);

        SpecialExpandModel model9 = new SpecialExpandModel();
        model9.setQuestion("Disciple");

        List<String> answers9 = new ArrayList<>();
        model9.setAnswer(answers9);

        SpecialExpandModel model10 = new SpecialExpandModel();
        model10.setQuestion("Other Reading Plans");


        List<String> answers10 = new ArrayList<>();
        model10.setAnswer(answers10);


        models.add(model1);
        models.add(model2);
        models.add(model3);
        models.add(model4);
        models.add(model5);
        models.add(model6);
        models.add(model7);
        models.add(model8);
        models.add(model9);
        models.add(model10);


        adapter = new ReadingPlansViewAdapter(recyclerView, models);

        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }

}
