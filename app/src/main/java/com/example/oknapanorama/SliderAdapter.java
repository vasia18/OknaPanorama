package com.example.oknapanorama;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    //(слайдер) Масив с картинками images которые будут перелистваться
    public int[] lst_images = {
            R.drawable.image_one,
            R.drawable.image_two,
            R.drawable.image_free
    };

    //(слайдер) Масив с заголовками которые будут перелистываться в месте с картинками
    private int[] lst_title = {
            R.string.title1,
            R.string.title2,
            R.string.title3
    };


    //(слайдер) Масив с фоном который будет перелистываться в месте с картинками и заголовком
    private int[] lst_description = {
            R.string.desc_textone,
            R.string.desc_texttwo,
            R.string.desc_textfree
    };

    //(Слайдер) Масив с фоном (Color) который будет перелистваться в месте с картинками
    private int[] lst_backgraundcolor = {
            R.color.fon_1,
            R.color.fon_2,
            R.color.fon_3
    };

    public SliderAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {

        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_slider, container, false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.slide_img);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_backgraundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;


    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

}
