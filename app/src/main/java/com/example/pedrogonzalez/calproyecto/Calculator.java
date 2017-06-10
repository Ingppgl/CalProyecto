package com.example.pedrogonzalez.calproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Calculator extends AppCompatActivity {

    public static final String ZERO = "0";
    public static final String ONE = "1";
    public static final String TWO = "2";
    public static final String THREE = "3";
    public static final String FOUR = "4";
    public static final String FIVE = "5";
    public static final String SIX = "6";
    public static final String SEVEN = "7";
    public static final String EIGHT = "8";
    public static final String NINE = "9";


    Button zero, one, two, three, four,
            five, six, seven, eight, nine,
            point, sign, product, divide, minus,
            plus, erase, equals, history, clean;

    int op;
    double num1, num2;
    TextView exit;
    String Variable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);

        point = (Button) findViewById(R.id.button_point);
        history = (Button) findViewById(R.id.button_history);


        zero = (Button) findViewById(R.id.button_0);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                Variable = exit.getText().toString() + ZERO;
                exit.setText(Variable);
            }
        });

        one = (Button) findViewById(R.id.button_1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                Variable = exit.getText().toString() + ONE;
                exit.setText(Variable);
            }
        });
        two = (Button) findViewById(R.id.button_2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                Variable = exit.getText().toString() + TWO;
                exit.setText(Variable);
            }
        });
        three = (Button) findViewById(R.id.button_3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                Variable = exit.getText().toString() + THREE;
                exit.setText(Variable);
            }
        });
        four = (Button) findViewById(R.id.button_4);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                Variable = exit.getText().toString() + FOUR;
                exit.setText(Variable);
            }
        });
        five = (Button) findViewById(R.id.button_5);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                Variable = exit.getText().toString() + FIVE;
                exit.setText(Variable);
            }
        });
        six = (Button) findViewById(R.id.button_6);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                Variable = exit.getText().toString() + SIX;
                exit.setText(Variable);
            }
        });
        seven = (Button) findViewById(R.id.button_7);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                Variable = exit.getText().toString() + SEVEN;
                exit.setText(Variable);
            }
        });
        eight = (Button) findViewById(R.id.button_8);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                Variable = exit.getText().toString() + EIGHT;
                exit.setText(Variable);
            }
        });
        nine = (Button) findViewById(R.id.button_9);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                Variable = exit.getText().toString() + NINE;
                exit.setText(Variable);
            }
        });
        clean = (Button) findViewById(R.id.clean);
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit.setText("");
            }

        });

        erase = (Button) findViewById(R.id.button_back);
        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                if (exit.getText().length() > 0) {
                    Variable = Variable.substring(0, exit.getText().length() - 1);
                    exit.setText(Variable);
                }
            }
        });

        plus = (Button) findViewById(R.id.button_plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 1;
                exit = (TextView) findViewById(R.id.screen);
                num1 = Double.valueOf(exit.getText().toString());
                exit.setText("");
            }
        });


        minus = (Button) findViewById(R.id.button_minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 2;
                exit = (TextView) findViewById(R.id.screen);
                num1 = Double.valueOf(exit.getText().toString());
                exit.setText("");
            }
        });
        product = (Button) findViewById(R.id.button_product);
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 3;
                exit = (TextView) findViewById(R.id.screen);
                num1 = Double.valueOf(exit.getText().toString());
                exit.setText("");
            }
        });
        divide = (Button) findViewById(R.id.button_divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 4;
                exit = (TextView) findViewById(R.id.screen);
                num1 = Double.valueOf(exit.getText().toString());
                exit.setText("");
            }
        });

        sign = (Button) findViewById(R.id.button_sign);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 5;
                exit = (TextView) findViewById(R.id.screen);
                num1 = Double.valueOf(exit.getText().toString()) * (-1);
                exit.setText(String.valueOf(num1));
            }
        });

        equals = (Button) findViewById(R.id.button_equal);

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                num2 = Double.valueOf(exit.getText().toString());

                if (op == 1) {
                    Variable = String.valueOf(plus(num1, num2));
                }

                if (op == 2) {
                    Variable = String.valueOf(minus(num1, num2));
                }

                if (op == 3) {
                    Variable = String.valueOf(product(num1, num2));
                }

                if (op == 4) {
                    Variable = (divide(num1, num2));
                }
                exit.setText(Variable);
            }
        });


    }

    private double plus(double a, double b) {
        double result;
        result = a + b;
        //String his = String.format("%s+%s = %s", a, b, result);
        return result;
    }

    private double minus(double a, double b) {
        double result;
        result = a - b;
        //String his = String.format("%s-%s = %s", a, b, result);

        return result;
    }

    private double product(double a, double b) {
        double result;
        result = a * b;
        //String his = String.format("%s*%s = %s", a, b, result);

        return result;
    }

    private String divide(double a, double b) {
        double result;
        String data;
        if (b != 0) {
            result = a / b;
            data = String.valueOf(result);
            //String his = String.format("%s+%s = %s", a, b, result);
        } else {
            data = "ZERO DIVIDE";
        }
        return data;
    }
}