package com.example.weatheralarmapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentWeatherAlarmOpened extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_weather_alarm_opened, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.imgWeatherAlarmClose);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlarmAddActivity alarmAddActivity = (AlarmAddActivity) getActivity();
                Toast.makeText(getContext(), "Opened", Toast.LENGTH_LONG).show();
                Log.d("Opened", "opened");
                alarmAddActivity.onFragmentChange(1);
            }
        });

        return rootView;
    }
}
