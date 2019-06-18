package com.example.milkworld;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

class ImageAdapter extends PagerAdapter {
   Context context;

    ImageAdapter(Context context){
        this.context =context;
    }
    @Override
    public int getCount() {
        return vp_images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (ImageView)o;
    }
    private int[] vp_images = new int[]{
       R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5
    };

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(vp_images[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object o) {
        ((ViewPager) container).removeView((ImageView) o);
    }
}
