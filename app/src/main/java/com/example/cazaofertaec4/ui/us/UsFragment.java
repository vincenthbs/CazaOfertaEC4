package com.example.cazaofertaec4.ui.us;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.cazaofertaec4.databinding.FragmentUsBinding;
import com.example.cazaofertaec4.ui.us.UsViewModel;

public class UsFragment extends Fragment {

    private FragmentUsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UsViewModel usViewModel =
                new ViewModelProvider(this).get(UsViewModel.class);

        binding = FragmentUsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textUs;
        usViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}