package org.shoalcreek;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReadingPlansActivity extends AppCompatActivity {

    private RecyclerViewAdapter adapter;
    private List<ExpandModel> models;
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

        ExpandModel model1 = new ExpandModel();
        model1.setQuestion("Quick path through the New Testament");
        model1.setAnswer(
                "-How did you do with last week’s I will and sharing?\n"
                        + "\n"
                        + " \n"
                        + "\n"
                        + "-With whom did you share last week’s lesson?\n"
                        + "\n"
                        + " \n"
                        + "\n"
                        + "-How did you put into practice what you learned from last week’s lesson?");

        ExpandModel model2 = new ExpandModel();
        model2.setQuestion("Trust A (Creation to Christ pt. 1)");
        model2.setAnswer(
                "An easy way to jump into the group.\n"
                        + "\n"
                        + "Call on someone by name, “Sara, what are you thankful for today?\n"
                        + "\n"
                        + " \n"
                        + "\n"
                        + "This question will help you expose the group to\n"
                        + "\n"
                        + "prayer. Prayer is expressing our thanks to God.\n"
                        + "\n"
                        + "Eventually you will be able to show them to how\n"
                        + "\n"
                        + "to express thanks to God rather than one\n"
                        + "\n"
                        + "another.");

        ExpandModel model3 = new ExpandModel();
        model3.setQuestion("Trust B (Creation to Christ pt. 2)");
        model3.setAnswer(
                "Authenticity is key to a community of Jesus\n"
                        + "\n"
                        + "followers. This question helps people learn how to\n"
                        + "\n"
                        + "relate deeper.\n"
                        + "\n"
                        + " \n"
                        + "\n"
                        + "Be careful though, this question can lead to time\n"
                        + "\n"
                        + "management issues in the group. Using the\n"
                        + "\n"
                        + "word, “today” or “one thing” can help limit the\n"
                        + "\n"
                        + "discussion so this question doesn’t derail the\n"
                        + "\n"
                        + "group.");

        ExpandModel model4 = new ExpandModel();
        model4.setQuestion("Obey");
        model4.setAnswer("This could be one of your neighbors, workmates or then someone in this group.");

        ExpandModel model5 = new ExpandModel();
        model5.setQuestion("Share");
        model5.setAnswer(
                "-Read the designated passage aloud in 2 different versions if available.\n"
                        + "\n"
                        + " \n"
                        + "\n"
                        + "-Have one person re-tell the passage in their own words.\n"
                        + "\n"
                        + " \n"
                        + "\n"
                        + " -You may want to appoint that person before you read.\n"
                        + "\n"
                        + " \n"
                        + "\n"
                        + " -Ask others to help add to what may have been missed or their insights");

        ExpandModel model6 = new ExpandModel();
        model6.setQuestion("Relate");
        model6.setAnswer(
                "Develop a tangible statement that will put into practice what you learned from the designated passage.\n"
                        + "\n"
                        + " \n"
                        + "\n"
                        + "For example, “I will take 10 minutes a day to reflect on how much God loves me”\n"
                        + "\n"
                        + " \n"
                        + "\n"
                        + " “I will begin to recycle because God has given me the earth to take care of.”\n"
                        + "\n"
                        + " \n"
                        + "\n"
                        + " To get them to make good “I will” statements you might need to take a few minutes of silence to let each person think about an “I will” statement then ask someone to start sharing what they have developed.\n"
                        + "\n"
                        + " \n"
                        + "\n"
                        + " Work to get “I will” statement specific, measurable, achievable, realistic and time bound.\n"
                        + "\n"
                        + " \n"
                        + "\n"
                        + " Make sure someone records the “I will” statements so you can ask next week about them.");

        ExpandModel model7 = new ExpandModel();
        model7.setQuestion("Serve");
        model7.setAnswer("Share with at least one person preferably who is not in a relationship with God and preferably someone already in your relational network.");

        ExpandModel model8 = new ExpandModel();
        model8.setQuestion("Give");
        model8.setAnswer("Share with at least one person preferably who is not in a relationship with God and preferably someone already in your relational network.");

        ExpandModel model9 = new ExpandModel();
        model9.setQuestion("Disciple");
        model9.setAnswer("Share with at least one person preferably who is not in a relationship with God and preferably someone already in your relational network.");

        ExpandModel model10 = new ExpandModel();
        model10.setQuestion("Other Reading Plans");
        model10.setAnswer("Share with at least one person preferably who is not in a relationship with God and preferably someone already in your relational network.");


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


        adapter = new RecyclerViewAdapter(recyclerView, models);

        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }

}
