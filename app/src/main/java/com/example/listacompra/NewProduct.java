package com.example.listacompra;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class NewProduct extends MainMenu {
    ImageView foto;
    ImageButton openCamera;

    private static final int REQUEST_PERMISSION_CAMERA = 100;
    private static final int REQUEST_IMAGE_CAMERA = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_product);
        foto = findViewById(R.id.producteNou);
        openCamera = findViewById(R.id.fotoProducte);
        openCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
                    if(ActivityCompat.checkSelfPermission(NewProduct.this, Manifest.permission.CAMERA)== PackageManager.PERMISSION_GRANTED){
                        OnClickfoto();
                    }else{
                        ActivityCompat.requestPermissions(NewProduct.this,new String[]{Manifest.permission.CAMERA},REQUEST_PERMISSION_CAMERA);
                    }

                }else{
                    OnClickfoto();
                }
            }
        });
    }
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permision,@NonNull int [] grantResult){
        if(requestCode == REQUEST_PERMISSION_CAMERA){
            if(permision.length > 0 && grantResult[0] == PackageManager.PERMISSION_GRANTED){
                OnClickfoto();
            }else{
                Toast.makeText(this,"Debes darle permisos a la camara",Toast.LENGTH_SHORT).show();
            }

        }
        super.onRequestPermissionsResult(requestCode,permision,grantResult);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == REQUEST_IMAGE_CAMERA){
            if(resultCode == Activity.RESULT_OK){
                Bitmap bitmap = (Bitmap) data.getExtras().get("data");
                foto.setImageBitmap(bitmap);

            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void OnClickfoto() {
        //obrir la camera i mostrarla en el image view
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(cameraIntent.resolveActivity(getPackageManager())!=null){
            startActivityForResult(cameraIntent,REQUEST_IMAGE_CAMERA);
        }
    }

    public void OnclickAlta(View view) {
        //donar de alta producte en firebase
    }
}