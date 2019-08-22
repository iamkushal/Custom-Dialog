package com.example.customdialog;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;


public class ProgressDialog { extends DialogFragment
    {
        ImageView imageView;
        int position=0;
        @Override
        public View onCreateView(LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.progress_dialog, container);
        imageView_1 = (ImageView) view.findViewById(R.id.pd_iv_fruit_1);
        imageView_2 = (ImageView) view.findViewById(R.id.pd_iv_fruit_2);
        imageView_3 = (ImageView) view.findViewById(R.id.pd_iv_fruit_3);
        imageView_4 = (ImageView) view.findViewById(R.id.pd_iv_fruit_4);
        imageView_5 = (ImageView) view.findViewById(R.id.pd_iv_fruit_5);
        getDialog().setCancelable(false);
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        getDialog().setCanceledOnTouchOutside(false);
        return view;
    }

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        changeImageSlider();
    }

        private void changeImageSlider() {
        position++;
        switch (position)
        {
            case 1:{ imageView_1.setImageResource(R.mipmap.ic_fruit_c_1); }break;
            case 2:{ imageView_2.setImageResource(R.mipmap.ic_fruit_c_2); }break;
            case 3:{ imageView_3.setImageResource(R.mipmap.ic_fruit_c_3); }break;
            case 4:{ imageView_4.setImageResource(R.mipmap.ic_fruit_c_4); }break;
            case 5:{ imageView_5.setImageResource(R.mipmap.ic_fruit_c_5); }break;
            case 6:{ imageView_1.setImageResource(R.mipmap.ic_fruit_1); }break;
            case 7:{ imageView_2.setImageResource(R.mipmap.ic_fruit_2); }break;
            case 8:{ imageView_3.setImageResource(R.mipmap.ic_fruit_3); }break;
            case 9:{ imageView_4.setImageResource(R.mipmap.ic_fruit_4); }break;
            case 10:{ imageView_5.setImageResource(R.mipmap.ic_fruit_5);position=0; }break;
            default:{position=0;}
        }


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                changeImageSlider();
            }
        }, 500);
    }
    }
