package com.example.cazaofertaec4.ui.contacus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.cazaofertaec4.databinding.FragmentContacusBinding;
import com.example.cazaofertaec4.ui.contacus.ContacusViewModel;

public class ContacusFragment extends Fragment {

    private FragmentContacusBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ContacusViewModel contacusViewModel =
                new ViewModelProvider(this).get(ContacusViewModel.class);

        binding = FragmentContacusBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textContacus;
        contacusViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}