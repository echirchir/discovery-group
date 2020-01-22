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

        answers1.add(getString(R.string.link_1));
        answers1.add(getString(R.string.link_2));
        answers1.add(getString(R.string.link_3));
        answers1.add(getString(R.string.link_4));
        answers1.add(getString(R.string.link_5));
        answers1.add(getString(R.string.link_6));
        answers1.add(getString(R.string.link_7));
        answers1.add(getString(R.string.link_8));
        answers1.add(getString(R.string.link_9));
        answers1.add(getString(R.string.link_10));
        answers1.add(getString(R.string.link_11));


        model1.setAnswer(answers1);

        SpecialExpandModel model2 = new SpecialExpandModel();
        model2.setQuestion("Trust A (Creation to Christ pt. 1)");

        List<String> answers2 = new ArrayList<>();

        answers2.add(getString(R.string.link_12));
        answers2.add(getString(R.string.link_13));
        answers2.add(getString(R.string.link_14));
        answers2.add(getString(R.string.link_15));
        answers2.add(getString(R.string.link_16));
        answers2.add(getString(R.string.link_17));
        answers2.add(getString(R.string.link_18));
        answers2.add(getString(R.string.link_19));
        answers2.add(getString(R.string.link_20));


        model2.setAnswer(answers2);

        SpecialExpandModel model3 = new SpecialExpandModel();
        model3.setQuestion("Trust B (Creation to Christ pt. 2)");

        List<String> answers3 = new ArrayList<>();

        answers3.add(getString(R.string.link_21));
        answers3.add(getString(R.string.link_22));
        answers3.add(getString(R.string.link_23));
        answers3.add(getString(R.string.link_24));
        answers3.add(getString(R.string.link_25));
        answers3.add(getString(R.string.link_26));
        answers3.add(getString(R.string.link_27));
        answers3.add(getString(R.string.link_28));

        model3.setAnswer(answers3);

        SpecialExpandModel model4 = new SpecialExpandModel();
        model4.setQuestion("Obey");

        List<String> answers4 = new ArrayList<>();

        answers4.add(getString(R.string.link_29));
        answers4.add(getString(R.string.link_30));
        answers4.add(getString(R.string.link_31));
        answers4.add(getString(R.string.link_32));
        answers4.add(getString(R.string.link_33));
        answers4.add(getString(R.string.link_34));
        answers4.add(getString(R.string.link_35));
        answers4.add(getString(R.string.link_36));
        answers4.add(getString(R.string.link_37));

        model4.setAnswer(answers4);

        SpecialExpandModel model5 = new SpecialExpandModel();
        model5.setQuestion("Share");

        List<String> answers5 = new ArrayList<>();

        answers5.add(getString(R.string.link_38));
        answers5.add(getString(R.string.link_39));
        answers5.add(getString(R.string.link_40));
        answers5.add(getString(R.string.link_41));
        answers5.add(getString(R.string.link_42));
        answers5.add(getString(R.string.link_43));
        answers5.add(getString(R.string.link_44));
        answers5.add(getString(R.string.link_45));
        answers5.add(getString(R.string.link_46));

        model5.setAnswer(answers5);

        SpecialExpandModel model6 = new SpecialExpandModel();
        model6.setQuestion("Relate");

        List<String> answers6 = new ArrayList<>();

        answers6.add(getString(R.string.link_47));
        answers6.add(getString(R.string.link_48));
        answers6.add(getString(R.string.link_49));
        answers6.add(getString(R.string.link_50));
        answers6.add(getString(R.string.link_51));
        answers6.add(getString(R.string.link_52));
        answers6.add(getString(R.string.link_53));
        answers6.add(getString(R.string.link_54));
        answers6.add(getString(R.string.link_55));

        model6.setAnswer(answers6);


        SpecialExpandModel model7 = new SpecialExpandModel();
        model7.setQuestion("Serve");

        List<String> answers7 = new ArrayList<>();

        answers7.add(getString(R.string.link_56));
        answers7.add(getString(R.string.link_57));
        answers7.add(getString(R.string.link_58));
        answers7.add(getString(R.string.link_59));
        answers7.add(getString(R.string.link_60));
        answers7.add(getString(R.string.link_61));
        answers7.add(getString(R.string.link_62));
        answers7.add(getString(R.string.link_63));
        answers7.add(getString(R.string.link_64));

        model7.setAnswer(answers7);

        SpecialExpandModel model8 = new SpecialExpandModel();
        model8.setQuestion("Give");


        List<String> answers8 = new ArrayList<>();

        answers8.add(getString(R.string.link_65));
        answers8.add(getString(R.string.link_66));
        answers8.add(getString(R.string.link_67));
        answers8.add(getString(R.string.link_68));
        answers8.add(getString(R.string.link_69));
        answers8.add(getString(R.string.link_70));
        answers8.add(getString(R.string.link_71));
        answers8.add(getString(R.string.link_72));
        answers8.add(getString(R.string.link_73));

        model8.setAnswer(answers8);

        SpecialExpandModel model9 = new SpecialExpandModel();
        model9.setQuestion("Disciple");

        List<String> answers9 = new ArrayList<>();

        answers9.add(getString(R.string.link_74));
        answers9.add(getString(R.string.link_75));
        answers9.add(getString(R.string.link_76));
        answers9.add(getString(R.string.link_77));
        answers9.add(getString(R.string.link_78));
        answers9.add(getString(R.string.link_79));
        answers9.add(getString(R.string.link_80));
        answers9.add(getString(R.string.link_81));

        model9.setAnswer(answers9);

        SpecialExpandModel model10 = new SpecialExpandModel();
        model10.setQuestion("Other Reading Plans");


        List<String> answers10 = new ArrayList<>();

        answers10.add(getString(R.string.link_82));
        answers10.add(getString(R.string.link_83));

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


        adapter = new ReadingPlansViewAdapter(recyclerView, models, this);

        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }

}
