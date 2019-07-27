import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Assignment16 {

    private Shell shell;
    private Text txtNumber;
    private static String symbol = null, newNumber = "new", lastPress;
    private static Double firstNumber, secondNumber = 0.0;

    /**
     * Launch the application.
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            Assignment16 window = new Assignment16();
            window.open();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Open the window.
     */
    private void open() {
        Display display = Display.getDefault();
        createContents();
        shell.open();
        shell.layout();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
    }

    /**
     * Create contents of the window.
     */
    private void createContents() {
        shell = new Shell();
        shell.setSize(277, 265);
        shell.setText("Calculator");


        txtNumber = new Text(shell, SWT.BORDER | SWT.RIGHT);
        txtNumber.setText("0.0");
        txtNumber.setBounds(10, 10, 239, 26);

        Button btnC = new Button(shell, SWT.NONE);
        btnC.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                txtNumber.setText("0.0");
                firstNumber = 0.0;
                secondNumber = 0.0;
                lastPress = "symbol";
            }
        });
        btnC.setText("C");
        btnC.setBounds(10, 42, 43, 30);

        Button btnsquare = new Button(shell, SWT.NONE);
        btnsquare.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                secondNumber = Double.parseDouble(txtNumber.getText());
                txtNumber.setText("" + (secondNumber * secondNumber));
                firstNumber = Double.parseDouble(txtNumber.getText());

                symbol = "square";
                newNumber = "new";
                lastPress = "symbol";
            }
        });
        btnsquare.setText("x^2");
        btnsquare.setBounds(59, 42, 43, 30);

        Button btnroot = new Button(shell, SWT.NONE);
        btnroot.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                secondNumber = Double.parseDouble(txtNumber.getText());
                txtNumber.setText("" + Math.sqrt(secondNumber));
                firstNumber = Double.parseDouble(txtNumber.getText());

                symbol = "square";
                newNumber = "new";
                lastPress = "symbol";
            }
        });
        btnroot.setText("\u221A");
        btnroot.setBounds(108, 42, 43, 30);

        Button btnPercentage = new Button(shell, SWT.NONE);
        btnPercentage.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                secondNumber = Double.parseDouble(txtNumber.getText());
                txtNumber.setText("" + (secondNumber / 100));
                firstNumber = Double.parseDouble(txtNumber.getText());

                symbol = "square";
                newNumber = "new";
                lastPress = "symbol";
            }
        });
        btnPercentage.setText("%");
        btnPercentage.setBounds(157, 42, 43, 30);

        Button btnReciprocal = new Button(shell, SWT.NONE);
        btnReciprocal.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                secondNumber = Double.parseDouble(txtNumber.getText());
                txtNumber.setText("" + (1 / secondNumber));
                firstNumber = Double.parseDouble(txtNumber.getText());

                symbol = "square";
                newNumber = "new";
                lastPress = "symbol";
            }
        });
        btnReciprocal.setText("1/x");
        btnReciprocal.setBounds(206, 42, 43, 30);

        Button btnSeven = new Button(shell, SWT.NONE);
        btnSeven.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Assignment16.this.addNumber("7", "7");
            }
        });
        btnSeven.setText("7");
        btnSeven.setBounds(10, 78, 43, 30);

        Button btneight = new Button(shell, SWT.NONE);
        btneight.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addNumber("8", "8");
            }
        });
        btneight.setText("8");
        btneight.setBounds(59, 78, 43, 30);

        Button btnnine = new Button(shell, SWT.NONE);
        btnnine.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addNumber("9", "9");
            }
        });
        btnnine.setText("9");
        btnnine.setBounds(108, 78, 43, 30);


        Button btnfour = new Button(shell, SWT.NONE);
        btnfour.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addNumber("4", "4");
            }
        });
        btnfour.setText("4");
        btnfour.setBounds(10, 114, 43, 30);

        Button btnfive = new Button(shell, SWT.NONE);
        btnfive.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addNumber("5", "5");
            }
        });
        btnfive.setText("5");
        btnfive.setBounds(59, 114, 43, 30);

        Button btnsix = new Button(shell, SWT.NONE);
        btnsix.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addNumber("6", "6");
            }
        });
        btnsix.setText("6");
        btnsix.setBounds(108, 114, 43, 30);


        Button btnone = new Button(shell, SWT.NONE);
        btnone.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addNumber("1", "1");
            }
        });
        btnone.setText("1");
        btnone.setBounds(10, 150, 43, 30);

        Button btntwo = new Button(shell, SWT.NONE);
        btntwo.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addNumber("2", "2");
            }
        });
        btntwo.setText("2");
        btntwo.setBounds(59, 150, 43, 30);

        Button btnthree = new Button(shell, SWT.NONE);
        btnthree.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addNumber("3", "3");
            }
        });
        btnthree.setText("3");
        btnthree.setBounds(108, 150, 43, 30);

        Button btn0 = new Button(shell, SWT.NONE);
        btn0.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addNumber("0", "0");
            }
        });
        btn0.setText("0");
        btn0.setBounds(10, 186, 92, 30);

        Button D = new Button(shell, SWT.NONE);
        D.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addNumber("0.", ".");
            }
        });
        D.setText(".");
        D.setBounds(108, 186, 43, 30);

        Button btnPlus = new Button(shell, SWT.NONE);
        btnPlus.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                nextCalculation("plus");
            }
        });
        btnPlus.setText("+");
        btnPlus.setBounds(157, 186, 43, 30);

        Button btnDivide = new Button(shell, SWT.NONE);
        btnDivide.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                nextCalculation("divide");
            }
        });
        btnDivide.setText("/");
        btnDivide.setBounds(157, 78, 43, 30);

        Button btnTimes = new Button(shell, SWT.NONE);
        btnTimes.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                nextCalculation("times");
            }
        });
        btnTimes.setText("*");
        btnTimes.setBounds(157, 114, 43, 30);

        Button btnMinus = new Button(shell, SWT.NONE);
        btnMinus.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                nextCalculation("minus");
            }
        });
        btnMinus.setText("-");
        btnMinus.setBounds(157, 150, 43, 30);

        Button btnEqual = new Button(shell, SWT.NONE);
        btnEqual.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                calculate();
                firstNumber = Double.parseDouble(txtNumber.getText());

                symbol = "equal";
                lastPress = "symbol";
                newNumber = "new";

            }
        });
        btnEqual.setText("=");
        btnEqual.setBounds(206, 78, 43, 138);

    }

    private void nextCalculation(String minus) {
        if (lastPress.equals("number")) {
            calculate();
        }
        firstNumber = Double.parseDouble(txtNumber.getText());

        symbol = minus;
        newNumber = "new";
        lastPress = "symbol";
    }

    private void calculate() {
        if (symbol.equals("times")) {
            txtNumber.setText("" + (firstNumber * secondNumber));
        }
        if (symbol.equals("divide")) {
            txtNumber.setText("" + (firstNumber / secondNumber));
        }
        if (symbol.equals("plus")) {
            txtNumber.setText("" + (firstNumber + secondNumber));
        }
        if (symbol.equals("minus")) {
            txtNumber.setText("" + (firstNumber - secondNumber));
        }
    }

    private void addNumber(String s, String s2) {
        if (newNumber != null) {
            txtNumber.setText(s);
            newNumber = null;
        } else {
            String equation = txtNumber.getText();
            txtNumber.setText(equation + s2);
        }
        secondNumber = Double.parseDouble(txtNumber.getText());
        lastPress = "number";
    }


}
