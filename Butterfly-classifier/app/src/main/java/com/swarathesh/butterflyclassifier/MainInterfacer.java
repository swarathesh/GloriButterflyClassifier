package com.swarathesh.butterflyclassifier;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.tomer.fadingtextview.FadingTextView;

import java.util.HashMap;

import static com.tomer.fadingtextview.FadingTextView.SECONDS;

//import com.bigkoo.convenientbanner.ConvenientBanner;
//import com.bigkoo.convenientbanner.holder.Holder;

public class MainInterfacer extends ActionBarActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    SliderLayout  mDemoSlider;
    ImageView mButton,mButton1,getmButton2,mbutton3;
    FadingTextView fadingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interfacer);
        mDemoSlider = (SliderLayout)findViewById(R.id.slider);
        mButton = (ImageView) findViewById(R.id.camera);
        mButton1 = (ImageView) findViewById(R.id.quiz);
        mbutton3 = (ImageView) findViewById(R.id.gallery);
        getmButton2 =  (ImageView) findViewById(R.id.vr);
        fadingTextView = (FadingTextView) findViewById(R.id.ftv);

        String[] texts = {
                "Do you know Butterflies taste with their feet.\n" ,
                "Do you know Butterflies don't have lungs.\n" ,
                "Do you know Butterflies breath through openings on their abdomen called 'spiracles'.\n" ,
                "Do you know Butterflies smell with their antennae.\n" ,
                "Do you know Female butterflies are usually bigger and live longer than male butterflies.\n" };
        fadingTextView.setTexts(texts);
        fadingTextView.setTimeout(10, SECONDS);//You can use an array resource or a string array as the parameter

        HashMap<String,String> url_maps = new HashMap<String, String>();
        url_maps.put("Information Sheets About Butterflies", "http://www.nathab.com/uploaded-files/carousels/TRIPS/Monarchs/Central-America-Monarch-Butterflies-4-group.jpg");
        url_maps.put("Butterfly Garden Plants", "https://s-media-cache-ak0.pinimg.com/originals/ec/ac/4b/ecac4b4a0bd2b445e09c94167f09c133.jpg");
        url_maps.put("Which country has the most butterfly?", "http://www.truebutterflies.com/sites/default/files/styles/slider/public/slider-img_2.png?itok=F1NLPK1_");
        url_maps.put("10 Most Unusual And Beautiful Butterflies In The World", "http://pre12.deviantart.net/bb58/th/pre/i/2012/202/d/3/butterfly_clipart_collage_by_csthruh2o-d581c98.jpg");


        for(String name : url_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(4000);
        mDemoSlider.addOnPageChangeListener(this);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainInterfacer.this, MainActivity.class));
            }
        });
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentquiz  = new Intent(MainInterfacer.this, WebViewActivity.class);
                intentquiz.putExtra("url","https://www.thatquiz.org/tq/practicetest?ey3dtrtx4uat");
                Toast.makeText(getApplicationContext(),"please wait quiz is loading",Toast.LENGTH_LONG).show();
                startActivity(intentquiz);
            }
        });
        getmButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainInterfacer.this, VrActivity.class));

            }
        });
        mbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentquiz7  = new Intent(MainInterfacer.this, WebViewActivity.class);
                intentquiz7.putExtra("url","http://www.obsessionwithbutterflies.com/gallery/butterflies/");
                Toast.makeText(getApplicationContext(),"please wait gallery is loading",Toast.LENGTH_LONG).show();
                startActivity(intentquiz7);

            }
        });


    }




    @Override
    public void onSliderClick(BaseSliderView slider) {
       // Toast.makeText(this,slider.getBundle().get("extra") + "",Toast.LENGTH_SHORT).show();
        String name = (String) slider.getBundle().get("extra");
        if (name.equals("Information Sheets About Butterflies")){
            Intent intentquiz1  = new Intent(MainInterfacer.this, WebViewActivity.class);
            intentquiz1.putExtra("url","http://www.enchantedlearning.com/subjects/butterflies/species/");
            Toast.makeText(getApplicationContext(),"please wait loading your article "+ name+" is loading....",Toast.LENGTH_LONG).show();
            startActivity(intentquiz1);

        }
        else if (name.equals("Butterfly Garden Plants")){
            Intent intentquiz2  = new Intent(MainInterfacer.this, WebViewActivity.class);
            intentquiz2.putExtra("url","http://www.glorious-butterfly.com/butterfly-garden-plants.html");
            Toast.makeText(getApplicationContext(),"please wait loading your article "+ name+" is loading....",Toast.LENGTH_LONG).show();
            startActivity(intentquiz2);

        }
        else if (name.equals("Which country has the most butterfly?")){
            Intent intentquiz3  = new Intent(MainInterfacer.this, WebViewActivity.class);
            intentquiz3.putExtra("url","http://www.truebutterflies.com/blog/which-country-has-most-butterfly-species");
            Toast.makeText(getApplicationContext(),"please wait loading your article "+ name+" is loading....",Toast.LENGTH_LONG).show();
            startActivity(intentquiz3);

        }
        else if (name.equals("10 Most Unusual And Beautiful Butterflies In The World")){
            Intent intentquiz4  = new Intent(MainInterfacer.this, WebViewActivity.class);
            intentquiz4.putExtra("url","https://themysteriousworld.com/10-most-unusual-and-beautiful-butterflies-in-the-world/");
            Toast.makeText(getApplicationContext(),"please wait loading your article "+ name+" is loading....",Toast.LENGTH_LONG).show();
            startActivity(intentquiz4);

        }


    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        //Toast.makeText(getApplicationContext(),String.valueOf(position),Toast.LENGTH_LONG).show();

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    protected void onStop() {
        mDemoSlider.stopAutoCycle();
        super.onStop();
    }
}
