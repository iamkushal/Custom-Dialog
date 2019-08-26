package com.example.customdialog;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;

import com.bumptech.glide.Glide;


public class FullscreenProgressDialog extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.progress_dialog_fullscreen, container);
        setUpDialog(view);
        return view;
    }

    private void setUpDialog(View view) {
        ImageView imageView = view.findViewById(R.id.loadingImageView);
        TextView message = view.findViewById(R.id.messageTextView);

        message.setText(R.string.verifying_dot);
        Glide.with(this).load(R.drawable.ic_circular_loading_white).into(imageView);
        getDialog().setCancelable(false);
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }
}
