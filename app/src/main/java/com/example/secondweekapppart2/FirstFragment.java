package com.example.secondweekapppart2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class FirstFragment extends Fragment {
    public FirstFragment() {
        super(R.layout.fragment_first);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("LifeCycle", "onAttach_1");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("LifeCycle", "onCreate_1");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("LifeCycle", "onCreateView_1");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button next = view.findViewById(R.id.next);
        Log.i("LifeCycle", "onViewCreated_1");
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .addToBackStack(SecondFragment.class.getName())
                        .replace(R.id.fragment_container_view,SecondFragment.class,null)
                        .commit();
            }
        };
        next.setOnClickListener(clickListener);
    }

    @Override
    public void onStart() {
        Log.i("LifeCycle", "onStart_1");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("LifeCycle", "onResume_1");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("LifeCycle", "onPause_1");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("LifeCycle", "onStop_1");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("LifeCycle", "onDestroyView_1");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("LifeCycle", "onDestroy_1");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("LifeCycle", "onDetach_1");
        super.onDetach();

    }
}
