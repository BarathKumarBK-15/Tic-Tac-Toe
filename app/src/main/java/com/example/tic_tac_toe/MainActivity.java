package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    int turn = 0;
    int win = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        ArrayList<Button> buttons = new ArrayList<>();

        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);

        Button reset = findViewById(R.id.reset);
        Button back = findViewById(R.id.back);

        final TextView text = findViewById(R.id.text2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = button1.getText().toString();
                if(!content.equals("X") && !content.equals("O") && win == 0) {
                    if(turn % 2 == 0) {
                        button1.setText("X");
                        text.setText(R.string.turno);

                    } else {
                        button1.setText("O");
                        text.setText(R.string.turnx);

                    }
                    turn ++;

                    win = checkWinner(buttons);
                    if(win == 1) {
                        text.setText(R.string.winx);
                    } else if(win == 2) {
                        text.setText(R.string.wino);
                    } else if(win == -1) {
                        text.setText(R.string.draw);
                    }

                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = button2.getText().toString();
                if(!content.equals("X") && !content.equals("O") && win == 0) {
                    if(turn % 2 == 0) {
                        button2.setText("X");
                        text.setText(R.string.turno);

                    } else {
                        button2.setText("O");
                        text.setText(R.string.turnx);

                    }
                    turn ++;

                    win = checkWinner(buttons);
                    if(win == 1) {
                        text.setText(R.string.winx);
                    } else if(win == 2) {
                        text.setText(R.string.wino);
                    } else if(win == -1) {
                        text.setText(R.string.draw);
                    }

                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = button3.getText().toString();
                if(!content.equals("X") && !content.equals("O") && win == 0) {
                    if(turn % 2 == 0) {
                        button3.setText("X");
                        text.setText(R.string.turno);

                    } else {
                        button3.setText("O");
                        text.setText(R.string.turnx);

                    }
                    turn ++;

                    win = checkWinner(buttons);
                    if(win == 1) {
                        text.setText(R.string.winx);
                    } else if(win == 2) {
                        text.setText(R.string.wino);
                    } else if(win == -1) {
                        text.setText(R.string.draw);
                    }

                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = button4.getText().toString();
                if(!content.equals("X") && !content.equals("O") && win == 0) {
                    if(turn % 2 == 0) {
                        button4.setText("X");
                        text.setText(R.string.turno);

                    } else {
                        button4.setText("O");
                        text.setText(R.string.turnx);

                    }
                    turn ++;

                    win = checkWinner(buttons);
                    if(win == 1) {
                        text.setText(R.string.winx);
                    } else if(win == 2) {
                        text.setText(R.string.wino);
                    } else if(win == -1) {
                        text.setText(R.string.draw);
                    }

                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = button5.getText().toString();
                if(!content.equals("X") && !content.equals("O") && win == 0) {
                    if(turn % 2 == 0) {
                        button5.setText("X");
                        text.setText(R.string.turno);

                    } else {
                        button5.setText("O");
                        text.setText(R.string.turnx);

                    }
                    turn ++;


                    win = checkWinner(buttons);
                    if(win == 1) {
                        text.setText(R.string.winx);
                    } else if(win == 2) {
                        text.setText(R.string.wino);
                    } else if(win == -1) {
                        text.setText(R.string.draw);
                    }

                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = button6.getText().toString();
                if(!content.equals("X") && !content.equals("O") && win == 0) {
                    if(turn % 2 == 0) {
                        button6.setText("X");
                        text.setText(R.string.turno);

                    } else {
                        button6.setText("O");
                        text.setText(R.string.turnx);

                    }
                    turn ++;

                    win = checkWinner(buttons);
                    if(win == 1) {
                        text.setText(R.string.winx);
                    } else if(win == 2) {
                        text.setText(R.string.wino);
                    } else if(win == -1) {
                        text.setText(R.string.draw);
                    }

                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = button7.getText().toString();
                if(!content.equals("X") && !content.equals("O") && win == 0) {
                    if(turn % 2 == 0) {
                        button7.setText("X");
                        text.setText(R.string.turno);

                    } else {
                        button7.setText("O");
                        text.setText(R.string.turnx);

                    }
                    turn ++;

                    win = checkWinner(buttons);
                    if(win == 1) {
                        text.setText(R.string.winx);
                    } else if(win == 2) {
                        text.setText(R.string.wino);
                    } else if(win == -1) {
                        text.setText(R.string.draw);
                    }

                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = button8.getText().toString();
                if(!content.equals("X") && !content.equals("O") && win == 0) {
                    if(turn % 2 == 0) {
                        button8.setText("X");
                        text.setText(R.string.turno);

                    } else {
                        button8.setText("O");
                        text.setText(R.string.turnx);

                    }
                    turn ++;

                    win = checkWinner(buttons);
                    if(win == 1) {
                        text.setText(R.string.winx);
                    } else if(win == 2) {
                        text.setText(R.string.wino);
                    } else if(win == -1) {
                        text.setText(R.string.draw);
                    }

                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = button9.getText().toString();
                if(!content.equals("X") && !content.equals("O") && win == 0) {
                    if(turn % 2 == 0) {
                        button9.setText("X");
                        text.setText(R.string.turno);

                    } else {
                        button9.setText("O");
                        text.setText(R.string.turnx);

                    }
                    turn ++;

                    win = checkWinner(buttons);
                    if(win == 1) {
                        text.setText(R.string.winx);
                    } else if(win == 2) {
                        text.setText(R.string.wino);
                    } else if(win == -1) {
                        text.setText(R.string.draw);
                    }

                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                text.setText(R.string.turnx);
                turn = 0;
                win = 0;

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Home.class));
            }
        });

    }

    protected int checkWinner(ArrayList<Button> buttons) {

        int total = 0;

        for(int i = 0; i < 3; i++) {
            int o_count = 0;
            int x_count = 0;
            int x_c = 0;
            int o_c = 0;

            for(int j = 0; j < 3; j++) {
                if(buttons.get(i * 3 + j).getText().toString().equals("X")) {
                    x_count ++;
                    total ++;
                } else if(buttons.get(i * 3 + j).getText().toString().equals("O")) {
                    o_count++;
                    total ++;
                }

                if(buttons.get(j * 3 + i).getText().toString().equals("X")) {
                    x_c ++;
                } else if(buttons.get(j * 3 + i).getText().toString().equals("O")) {
                    o_c ++;
                }
            }

            if(x_count == 3 || x_c == 3) {
                return 1;
            } else if(o_count == 3 || o_c == 3) {
                return 2;
            }
        }

        String[] values = new String[9];

        for(int i = 0; i < 9; i++) {
            values[i] = buttons.get(i).getText().toString();
        }

        int X_count = 0;
        int O_count = 0;

        for(int  i = 0; i < 3; i++) {
            if(values[i * 3 + i].equals("X")) {
                X_count ++;
            } else if(values[i * 3 + i].equals("O")) {
                O_count ++;
            }
        }

        if(X_count == 3) {
            return 1;
        } else if(O_count == 3) {
            return 2;
        }

        X_count = 0;
        O_count = 0;

        for(int  i = 1; i <= 3; i++) {
            if(values[2 * i].equals("X")) {
                X_count ++;
            } else if(values[i * 2].equals("O")) {
                O_count ++;
            }
        }

        if(X_count == 3) {
            return 1;
        } else if(O_count == 3) {
            return 2;
        }

        if(total == 9) {
            return -1;
        }

        return 0;
    }
}