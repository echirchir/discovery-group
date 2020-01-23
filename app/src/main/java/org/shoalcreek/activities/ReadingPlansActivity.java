package org.shoalcreek.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.shoalcreek.R;
import org.shoalcreek.adapters.ReadingPlansViewAdapter;
import org.shoalcreek.models.SpecialExpandModel;

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
        List<String> urls1 = new ArrayList<>();

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


        model1.setAnswers(answers1);

        urls1.add("https://www.biblegateway.com/passage/?search=Genesis+1&amp;version=NIV");
        urls1.add("https://www.biblegateway.com/passage/?search=Genesis+3%3A+1-19&amp;version=NIV");
        urls1.add("https://www.biblegateway.com/passage/?search=1+John+1%3A5-10&amp;version=NIV");
        urls1.add("https://www.biblegateway.com/passage/?search=Luke+5%3A17-26&amp;version=NIV");
        urls1.add("https://www.biblegateway.com/passage/?search=John+3%3A1-21&amp;version=NIV");
        urls1.add("https://www.biblegateway.com/passage/?search=Luke+23%3A32-24%3A8&amp;version=NIV");
        urls1.add("https://www.biblegateway.com/passage/?search=Luke+24%3A44-49&amp;version=NIV");
        urls1.add("https://www.biblegateway.com/passage/?search=Acts+2%3A29-41&amp;version=NIV");
        urls1.add("https://www.biblegateway.com/passage/?search=Romans+5%3A1-11&amp;version=NIV");
        urls1.add("https://www.biblegateway.com/passage/?search=Galatians+5%3A13-26&amp;version=NIV");
        urls1.add("https://www.biblegateway.com/passage/?search=Matthew+28%3A16-20&amp;version=NIV");

        model1.setUrls(urls1);

        //-------------------------------------------------------

        SpecialExpandModel model2 = new SpecialExpandModel();
        model2.setQuestion("Trust A (Creation to Christ pt. 1)");

        List<String> answers2 = new ArrayList<>();
        List<String> urls2 = new ArrayList<>();

        answers2.add(getString(R.string.link_12));
        answers2.add(getString(R.string.link_13));
        answers2.add(getString(R.string.link_14));
        answers2.add(getString(R.string.link_15));
        answers2.add(getString(R.string.link_16));
        answers2.add(getString(R.string.link_17));
        answers2.add(getString(R.string.link_18));
        answers2.add(getString(R.string.link_19));
        answers2.add(getString(R.string.link_20));


        model2.setAnswers(answers2);

        urls2.add("https://www.biblegateway.com/passage/?search=Genesis+1&amp;version=NIV");
        urls2.add("https://www.biblegateway.com/passage/?search=Genesis+3%3A+1-19&amp;version=NIV");
        urls2.add("https://www.biblegateway.com/passage/?search=Genesis+6%3A9-22&amp;version=NLT");
        urls2.add("https://www.biblegateway.com/passage/?search=Exodus+20%3A1-21&amp;version=NLT");
        urls2.add("https://www.biblegateway.com/passage/?search=Leviticus+4%3A1-7&amp;version=NIV");
        urls2.add("https://www.biblegateway.com/passage/?search=Isaiah+53&amp;version=NLT");
        urls2.add("https://www.biblegateway.com/passage/?search=Hosea+3&amp;version=NIV");
        urls2.add("https://www.biblegateway.com/passage/?search=Luke+2%3A1-20&amp;version=NIV");
        urls2.add("https://www.biblegateway.com/passage/?search=Luke+5%3A17-26&amp;version=NLT");

        model2.setUrls(urls2);

        //-------------------------------------------------------

        SpecialExpandModel model3 = new SpecialExpandModel();
        model3.setQuestion("Trust B (Creation to Christ pt. 2)");

        List<String> answers3 = new ArrayList<>();
        List<String> urls3 = new ArrayList<>();

        answers3.add(getString(R.string.link_21));
        answers3.add(getString(R.string.link_22));
        answers3.add(getString(R.string.link_23));
        answers3.add(getString(R.string.link_24));
        answers3.add(getString(R.string.link_25));
        answers3.add(getString(R.string.link_26));
        answers3.add(getString(R.string.link_27));
        answers3.add(getString(R.string.link_28));

        model3.setAnswers(answers3);

        urls3.add("https://www.biblegateway.com/passage/?search=John+3%3A1-18&amp;version=NIV");
        urls3.add("https://www.biblegateway.com/passage/?search=Luke+15%3A11-32&amp;version=NLT");
        urls3.add("https://www.biblegateway.com/passage/?search=Luke+18%3A18-25&amp;version=NIV");
        urls3.add("https://www.biblegateway.com/passage/?search=John+11%3A38-44&amp;version=NIV");
        urls3.add("https://www.biblegateway.com/passage/?search=Luke+24%3A36-49&amp;version=NIV");
        urls3.add("https://www.biblegateway.com/passage/?search=Romans+5%3A1-11&amp;version=NLT");
        urls3.add("https://www.biblegateway.com/passage/?search=Acts+1%3A1-11&amp;version=NLT");
        urls3.add("https://www.biblegateway.com/passage/?search=Acts+2%3A29-38&amp;version=NLT");

        model3.setUrls(urls3);

        //-------------------------------------------------------

        SpecialExpandModel model4 = new SpecialExpandModel();
        model4.setQuestion("Obey");

        List<String> answers4 = new ArrayList<>();
        List<String> urls4 = new ArrayList<>();

        answers4.add(getString(R.string.link_29));
        answers4.add(getString(R.string.link_30));
        answers4.add(getString(R.string.link_31));
        answers4.add(getString(R.string.link_32));
        answers4.add(getString(R.string.link_33));
        answers4.add(getString(R.string.link_34));
        answers4.add(getString(R.string.link_35));
        answers4.add(getString(R.string.link_36));
        answers4.add(getString(R.string.link_37));

        model4.setAnswers(answers4);

        urls4.add("https://www.biblegateway.com/passage/?search=Mark+7%3A17-23&amp;version=NLT");
        urls4.add("https://www.biblegateway.com/passage/?search=Luke+9%3A23-25&amp;version=NIV");
        urls4.add("https://www.biblegateway.com/passage/?search=Luke+18%3A9-14&amp;version=NLT");
        urls4.add("https://www.biblegateway.com/passage/?search=Ephesians+2%3A1-10&amp;version=NLT");
        urls4.add("https://www.biblegateway.com/passage/?search=1+John+2%3A1-6&amp;version=NLT");
        urls4.add("https://www.biblegateway.com/passage/?search=Psalm+119%3A24-33&amp;version=NIV");
        urls4.add("https://www.biblegateway.com/passage/?search=Romans+12%3A1-2&amp;version=NLT");
        urls4.add("https://www.biblegateway.com/passage/?search=Proverbs+3%3A5-6&amp;version=NLT");
        urls4.add("https://www.biblegateway.com/passage/?search=1+Corinthians+6%3A12-20&amp;version=NLT");

        model4.setUrls(urls4);

        //-------------------------------------------------------

        SpecialExpandModel model5 = new SpecialExpandModel();
        model5.setQuestion("Share");

        List<String> answers5 = new ArrayList<>();
        List<String> urls5 = new ArrayList<>();

        answers5.add(getString(R.string.link_38));
        answers5.add(getString(R.string.link_39));
        answers5.add(getString(R.string.link_40));
        answers5.add(getString(R.string.link_41));
        answers5.add(getString(R.string.link_42));
        answers5.add(getString(R.string.link_43));
        answers5.add(getString(R.string.link_44));
        answers5.add(getString(R.string.link_45));
        answers5.add(getString(R.string.link_46));

        model5.setAnswers(answers5);

        urls5.add("https://www.biblegateway.com/passage/?search=Matthew+28%3A16-20&amp;version=NIV");
        urls5.add("https://www.biblegateway.com/passage/?search=2+Corinthians+5%3A16-21&amp;version=NIV");
        urls5.add("https://www.biblegateway.com/passage/?search=Matthew+5%3A13-16&amp;version=NLT");
        urls5.add("https://www.biblegateway.com/passage/?search=1+Corinthians+9%3A19-23&amp;version=NLT");
        urls5.add("https://www.biblegateway.com/passage/?search=Luke+10%3A1-11&amp;version=NIV");
        urls5.add("https://www.biblegateway.com/passage/?search=Acts+1%3A6-8&amp;version=NLT");
        urls5.add("https://www.biblegateway.com/passage/?search=John+4%3A27-35&amp;version=NIV");
        urls5.add("https://www.biblegateway.com/passage/?search=Luke+19%3A1-10&amp;version=NLT");
        urls5.add("https://www.biblegateway.com/passage/?search=Matthew+9%3A35-38&amp;version=NLT");

        model5.setUrls(urls5);

        //-------------------------------------------------------

        SpecialExpandModel model6 = new SpecialExpandModel();
        model6.setQuestion("Relate");

        List<String> answers6 = new ArrayList<>();
        List<String> urls6 = new ArrayList<>();

        answers6.add(getString(R.string.link_47));
        answers6.add(getString(R.string.link_48));
        answers6.add(getString(R.string.link_49));
        answers6.add(getString(R.string.link_50));
        answers6.add(getString(R.string.link_51));
        answers6.add(getString(R.string.link_52));
        answers6.add(getString(R.string.link_53));
        answers6.add(getString(R.string.link_54));
        answers6.add(getString(R.string.link_55));

        model6.setAnswers(answers6);

        urls6.add("https://www.biblegateway.com/passage/?search=Mark+2%3A1-12&amp;version=NLT");
        urls6.add("https://www.biblegateway.com/passage/?search=Hebrews+10%3A24-25&amp;version=NLT");
        urls6.add("https://www.biblegateway.com/passage/?search=Philippians+2%3A3-8&amp;version=NLT");
        urls6.add("https://www.biblegateway.com/passage/?search=Ecclesiastes+4%3A9-10&amp;version=NLT");
        urls6.add("https://www.biblegateway.com/passage/?search=Acts+2%3A41-47&amp;version=NLT");
        urls6.add("https://www.biblegateway.com/passage/?search=John+13%3A34-35&amp;version=NLT");
        urls6.add("https://www.biblegateway.com/passage/?search=1+Peter+1%3A13-23&amp;version=NIV");
        urls6.add("https://www.biblegateway.com/passage/?search=Ephesians+4%3A20-29&amp;version=NIV");
        urls6.add("https://www.biblegateway.com/passage/?search=Romans+12%3A9-21&amp;version=NLT");

        model6.setUrls(urls6);

        //-------------------------------------------------------


        SpecialExpandModel model7 = new SpecialExpandModel();
        model7.setQuestion("Serve");

        List<String> answers7 = new ArrayList<>();
        List<String> urls7 = new ArrayList<>();

        answers7.add(getString(R.string.link_56));
        answers7.add(getString(R.string.link_57));
        answers7.add(getString(R.string.link_58));
        answers7.add(getString(R.string.link_59));
        answers7.add(getString(R.string.link_60));
        answers7.add(getString(R.string.link_61));
        answers7.add(getString(R.string.link_62));
        answers7.add(getString(R.string.link_63));
        answers7.add(getString(R.string.link_64));

        model7.setAnswers(answers7);

        urls7.add("https://www.biblegateway.com/passage/?search=Luke+12%3A13-21&amp;version=NLT");
        urls7.add("https://www.biblegateway.com/passage/?search=Luke+8%3A4-15&amp;version=NLT");
        urls7.add("https://www.biblegateway.com/passage/?search=Romans+12%3A3-8&amp;version=NLT");
        urls7.add("https://www.biblegateway.com/passage/?search=Luke+19%3A10-27&amp;version=NIV");
        urls7.add("https://www.biblegateway.com/passage/?search=1+Peter+4%3A7-11&amp;version=NLT");
        urls7.add("https://www.biblegateway.com/passage/?search=Galatians+3%3A26-29&amp;version=NLT");
        urls7.add("https://www.biblegateway.com/passage/?search=1+Peter+2%3A1-9&amp;version=NLT");
        urls7.add("https://www.biblegateway.com/passage/?search=Matthew+28%3A16-20&amp;version=NLT");
        urls7.add("https://www.biblegateway.com/passage/?search=1+Corinthians+12%3A1-12&amp;version=NIV");

        model7.setUrls(urls7);

        //-------------------------------------------------------

        SpecialExpandModel model8 = new SpecialExpandModel();
        model8.setQuestion("Give");


        List<String> answers8 = new ArrayList<>();
        List<String> urls8 = new ArrayList<>();

        answers8.add(getString(R.string.link_65));
        answers8.add(getString(R.string.link_66));
        answers8.add(getString(R.string.link_67));
        answers8.add(getString(R.string.link_68));
        answers8.add(getString(R.string.link_69));
        answers8.add(getString(R.string.link_70));
        answers8.add(getString(R.string.link_71));
        answers8.add(getString(R.string.link_72));
        answers8.add(getString(R.string.link_73));

        model8.setAnswers(answers8);

        urls8.add("https://www.biblegateway.com/passage/?search=Romans+8%3A31-32&amp;version=NIV");
        urls8.add("https://www.biblegateway.com/passage/?search=Matthew+6%3A19-24&amp;version=NIV");
        urls8.add("https://www.biblegateway.com/passage/?search=Luke+18%3A18-25&amp;version=NIV");
        urls8.add("https://www.biblegateway.com/passage/?search=2+Corinthians+9%3A6-15&amp;version=NLT");
        urls8.add("https://www.biblegateway.com/passage/?search=Ecclesiastes+2%3A1-11&amp;version=NLT");
        urls8.add("https://www.biblegateway.com/passage/?search=Proverbs+6%3A6-11&amp;version=NLT");
        urls8.add("https://www.biblegateway.com/passage/?search=1+Timothy+6%3A6-10&amp;version=NLT");
        urls8.add("https://www.biblegateway.com/passage/?search=Mark+12%3A41-44&amp;version=NIV");
        urls8.add("https://www.biblegateway.com/passage/?search=2+Corinthians+8%3A1-7+&amp;version=NIV");

        model8.setUrls(urls8);

        //-------------------------------------------------------

        SpecialExpandModel model9 = new SpecialExpandModel();
        model9.setQuestion("Disciple");

        List<String> answers9 = new ArrayList<>();
        List<String> urls9 = new ArrayList<>();

        answers9.add(getString(R.string.link_74));
        answers9.add(getString(R.string.link_75));
        answers9.add(getString(R.string.link_76));
        answers9.add(getString(R.string.link_77));
        answers9.add(getString(R.string.link_78));
        answers9.add(getString(R.string.link_79));
        answers9.add(getString(R.string.link_80));
        answers9.add(getString(R.string.link_81));

        model9.setAnswers(answers9);

        urls9.add("https://www.biblegateway.com/passage/?search=Matthew+28%3A16-20&amp;version=NLT");
        urls9.add("https://www.biblegateway.com/passage/?search=Luke+14%3A25-33&amp;version=NIV");
        urls9.add("https://www.biblegateway.com/passage/?search=2+Timothy+2%3A1-7&amp;version=NIV");
        urls9.add("https://www.biblegateway.com/passage/?search=John+15%3A1-8&amp;version=NLT");
        urls9.add("https://www.biblegateway.com/passage/?search=Matthew+5%3A3-12&amp;version=NLT");
        urls9.add("https://www.biblegateway.com/passage/?search=2+Corinthians+5%3A16-20&amp;version=NLT");
        urls9.add("https://www.biblegateway.com/passage/?search=Hebrews+5%3A11-14&amp;version=NLT");
        urls9.add("https://www.biblegateway.com/passage/?search=Matthew+7%3A21-27&amp;version=NLT");

        model9.setUrls(urls9);

        //-------------------------------------------------------

        SpecialExpandModel model10 = new SpecialExpandModel();
        model10.setQuestion("Other Reading Plans");


        List<String> answers10 = new ArrayList<>();
        List<String> urls10 = new ArrayList<>();

        answers10.add(getString(R.string.link_82));
        answers10.add(getString(R.string.link_83));

        model10.setAnswers(answers10);

        urls10.add("http://dgapp.org/assets/marriage.pdf");
        urls10.add("http://dgapp.org/assets/parenting.pdf");

        model10.setUrls(urls10);


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
