package com.example.cazaofertaec4.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.cazaofertaec4.databinding.FragmentProfileBinding;
import com.example.cazaofertaec4.ui.profile.ProfileViewModel;

public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        TextView textViewNombreValue = binding.textViewNombreValue;
        TextView textViewApellidoValue = binding.textViewApellidoValue;
        TextView textViewEdadValue = binding.textViewEdadValue;
        TextView textViewCorreoValue = binding.textViewCorreoValue;

        String nombre = "Juan";
        String apellido = "Pérez";
        int edad = 30;
        String correo = "juan.perez@example.com";

        textViewNombreValue.setText("Nombre: " + nombre);
        textViewApellidoValue.setText("Apellido: " + apellido);
        textViewEdadValue.setText("Edad: " + String.valueOf(edad));
        textViewCorreoValue.setText("Correo: " + correo);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
