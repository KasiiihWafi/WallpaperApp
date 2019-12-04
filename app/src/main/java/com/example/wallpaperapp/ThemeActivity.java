package com.example.wallpaperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.IOException;

public class ThemeActivity extends AppCompatActivity {

    LinearLayout theme_preview;
    Button btn_back, btn_save;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);

        btn_back = (Button) findViewById(R.id.btn_back);
        btn_save = (Button) findViewById(R.id.btn_save);
        theme_preview = (LinearLayout) findViewById(R.id.theme_preview);


        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                newString = null;
            } else {
                newString = extras.getString("PATH_PICTURE");
                if (newString.equals("btn_1")) {
                    theme_preview.setBackgroundResource(R.drawable.hdsatu);

                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.hdsatu);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else
                    newString = extras.getString("PATH_PICTURE");
                    if (newString.equals("btn_2")) {
                    theme_preview.setBackgroundResource(R.drawable.hddua);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.hddua);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });

                } else
                    newString = extras.getString("PATH_PICTURE");
                    if (newString.equals("btn_3")) {
                    theme_preview.setBackgroundResource(R.drawable.hdtiga);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.hdtiga);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });

                } else
                    newString = extras.getString("PATH_PICTURE");
                    if (newString.equals("btn_4")) {
                    theme_preview.setBackgroundResource(R.drawable.hdempat);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.hdempat);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });

                } else
                    newString = extras.getString("PATH_PICTURE");
                    if (newString.equals("btn_5")) {
                    theme_preview.setBackgroundResource(R.drawable.hdlima);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.hdlima);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });

                } else
                    newString = extras.getString("PATH_PICTURE");
                    if (newString.equals("btn_6")) {
                    theme_preview.setBackgroundResource(R.drawable.hdenam);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.hdenam);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });

                } else
                    newString = extras.getString("PATH_PICTURE");
                    if (newString.equals("btn7")) {
                    theme_preview.setBackgroundResource(R.drawable.hdtujuh);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.hdtujuh);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });

                } else
                    newString = extras.getString("PATH_PICTURE");
                    if (newString.equals("btn_8")) {
                    theme_preview.setBackgroundResource(R.drawable.hddelapan);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.hddelapan);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });

                } else
                    newString = extras.getString("PATH_PICTURE");
                    if (newString.equals("btn_9")) {
                    theme_preview.setBackgroundResource(R.drawable.hdsembilan);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.hdsembilan);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            }


            btn_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBackPressed();
                }
            });

        }
    }

}
