package com.example.secondweekapppart2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {
    public SecondFragment() {
        super(R.layout.fragment_second);
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("LifeCycle", "onAttach_2");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("LifeCycle", "onCreate_2");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("LifeCycle", "onCreateView_2");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("LifeCycle", "onViewCreated_2");
        Button button = view.findViewById(R.id.alert);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog();
            }
        };
        button.setOnClickListener(clickListener);

    }
    private void myDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Alert Dialog");
        builder.setMessage("Это всего лишь пример, не беспокойтесь)");
        builder.setPositiveButton("ОК", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    @Override
    public void onStart() {
        Log.i("LifeCycle", "onStart_2");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("LifeCycle", "onResume_2");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("LifeCycle", "onPause_2");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("LifeCycle", "onStop_2");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("LifeCycle", "onDestroyView_2");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("LifeCycle", "onDestroy_2");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("LifeCycle", "onDetach_2");
        super.onDetach();

    }
}
