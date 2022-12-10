package com.darshan09200.employeemanagement;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;

import com.darshan09200.employeemanagement.databinding.ActivityRegistrationBinding;

import java.util.ArrayList;

public class RegistrationController {

    ActivityRegistrationBinding binding;

    ArrayList<String> vehicleMakes;
    ArrayAdapter<String> vehicleMakeAdapter;

    public RegistrationController(Context context, ActivityRegistrationBinding binding) {
        this.binding = binding;

        vehicleMakes = Registration.getInstance().getVehicleMakeData();
        vehicleMakeAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_item, vehicleMakes);
        vehicleMakeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.vehicleMake.setAdapter(vehicleMakeAdapter);

        resetUI();
    }

    public void resetUI() {
        binding.empId.setText("123");
        binding.dob.setText("12/34/5678");

        binding.bonusLabel.setText("Number of Clients");

        binding.vehicle.check(R.id.car);

        showVehicleType();
        hideSidecar();
    }

    private void showVehicleType() {
        if (binding.vehicleTypeLabel.getVisibility() != View.VISIBLE) {
            binding.vehicleTypeLabel.setVisibility(View.VISIBLE);
            binding.vehicleType.setVisibility(View.VISIBLE);
        }
    }

    private void hideVehicleType() {
        if (binding.vehicleTypeLabel.getVisibility() != View.GONE) {
            binding.vehicleTypeLabel.setVisibility(View.GONE);
            binding.vehicleType.setVisibility(View.GONE);
        }
    }

    private void showSidecar() {
        if (binding.sidecarLayout.getVisibility() != View.VISIBLE) {
            binding.sidecarLayout.setVisibility(View.VISIBLE);
        }
    }

    private void hideSidecar() {
        if (binding.sidecarLayout.getVisibility() != View.GONE) {
            binding.sidecarLayout.setVisibility(View.GONE);
        }
    }
}
