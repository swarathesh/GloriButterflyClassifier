package com.swarathesh.butterflyclassifier;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detailactivity extends AppCompatActivity {
    TextView mTextView,mtextview1,mtextview2;
  ImageView background;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailactivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //initiate txt views
        mTextView = (TextView) findViewById(R.id.description);
        mtextview1 = (TextView) findViewById(R.id.lifecycle);
        mtextview2= (TextView) findViewById(R.id.habitat);
        background = (ImageView)  findViewById(R.id.map);
        Bundle butterflycatagory = getIntent().getExtras();
        String butterflyname = butterflycatagory.getString("butterflyname");
        Toast.makeText(getApplicationContext(),"Butterfly name "+butterflyname,Toast.LENGTH_LONG).show();
        background.setBackground(getResources().getDrawable(R.drawable.map_america));

        // set the details
         if (butterflyname.equals("monarch")){
             mTextView.setText(ConstantsDetails.Monarch.Description);
             mtextview1.setText(ConstantsDetails.Monarch.LifeCycle);
             mtextview2.setText(ConstantsDetails.Monarch.Habitat);
          background.setBackground(getResources().getDrawable(R.drawable.map_america));

         }else if (butterflyname.equals("common buckeye")){
             mTextView.setText(ConstantsDetails.Common.Description);
             mtextview1.setText(ConstantsDetails.Common.LifeCycle);
             mtextview2.setText(ConstantsDetails.Common.Habitat);

         }else if (butterflyname.equals("american copper")){
             mTextView.setText(ConstantsDetails.American.Description);
             mtextview1.setText(ConstantsDetails.American.LifeCycle);
             mtextview2.setText(ConstantsDetails.American.Habitat);

         }else if (butterflyname.equals("red admiral")){
             mTextView.setText(ConstantsDetails.Red.Description);
             mtextview1.setText(ConstantsDetails.Red.LifeCycle);
             mtextview2.setText(ConstantsDetails.Red.Habitat);

         }else if (butterflyname.equals("mourning cloak")){
             mTextView.setText(ConstantsDetails.Mourning.Description);
             mtextview1.setText(ConstantsDetails.Mourning.LifeCycle);
             mtextview2.setText(ConstantsDetails.Mourning.Habitat);

         }else if (butterflyname.equals("zebra longwing")){
             mTextView.setText(ConstantsDetails.Zebra.Description);
             mtextview1.setText(ConstantsDetails.Zebra.LifeCycle);
             mtextview2.setText(ConstantsDetails.Zebra.Habitat);

         }else if (butterflyname.equals("cabbage white")){
             mTextView.setText(ConstantsDetails.Cabbage.Description);
             mtextview1.setText(ConstantsDetails.Cabbage.LifeCycle);
             mtextview2.setText(ConstantsDetails.Cabbage.Habitat);

         }else if (butterflyname.equals("painted lady")){
             mTextView.setText(ConstantsDetails.Painted.Description);
             mtextview1.setText(ConstantsDetails.Painted.LifeCycle);
             mtextview2.setText(ConstantsDetails.Painted.Habitat);

         }else if (butterflyname.equals("crimson patched longwing")){
             mTextView.setText(ConstantsDetails.Crimson.Description);
             mtextview1.setText(ConstantsDetails.Crimson.LifeCycle);
             mtextview2.setText(ConstantsDetails.Crimson.Habitat);

         }else if (butterflyname.equals("giant swallowtail")){
             mTextView.setText(ConstantsDetails.Giant.Description);
             mtextview1.setText(ConstantsDetails.Giant.LifeCycle);
             mtextview2.setText(ConstantsDetails.Giant.Habitat);

         }else {
             mTextView.setText(ConstantsDetails.dummy.Description);
             mtextview1.setText(ConstantsDetails.dummy.LifeCycle);
             mtextview2.setText(ConstantsDetails.dummy.Habitat);
             background.setBackground(getResources().getDrawable(R.drawable.indiamap));
         }








    }
}
