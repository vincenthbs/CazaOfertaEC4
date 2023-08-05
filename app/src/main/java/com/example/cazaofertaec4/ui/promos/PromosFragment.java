package com.example.cazaofertaec4.ui.promos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.cazaofertaec4.R;
public class PromosFragment extends Fragment {

    private EditText productNameEditText;
    private EditText productPriceEditText;
    private Spinner productCategoriesSpinner;
    private EditText productLocationEditText;
    private ImageView productImageView;
    private Button adjuntarImagenButton;
    private Button publicarButton;

    private PromosViewModel viewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_promos, container, false);

        productNameEditText = root.findViewById(R.id.productname);
        productPriceEditText = root.findViewById(R.id.productprice);
        productCategoriesSpinner = root.findViewById(R.id.productcategories);
        productLocationEditText = root.findViewById(R.id.productlocation);
        productImageView = root.findViewById(R.id.productimages);
        adjuntarImagenButton = root.findViewById(R.id.btn_adjimagen);
        publicarButton = root.findViewById(R.id.btn_publicar);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                requireContext(),
                R.array.product_categories,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        productCategoriesSpinner.setAdapter(adapter);

        adjuntarImagenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        publicarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productName = productNameEditText.getText().toString();
                String productPrice = productPriceEditText.getText().toString();
                String productCategory = productCategoriesSpinner.getSelectedItem().toString();
                String productLocation = productLocationEditText.getText().toString();

                viewModel.setProductName(productName);
                viewModel.setProductPrice(productPrice);
                viewModel.setProductCategory(productCategory);
                viewModel.setProductLocation(productLocation);

            }
        });

        return root;
    }
}

