import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Assignment16 {

	protected Shell shell;
	private Text txtnumber;
	public static String symbol=null, newnumber="new", lastpress;
	public static Double firstnumber, secondNumber = 0.0;

	/**
	 * Launch the application.
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
	public void open() {
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
	protected void createContents() {
		shell = new Shell();
		shell.setSize(277, 265);
		shell.setText("Calculator");
	
		
		txtnumber = new Text(shell, SWT.BORDER | SWT.RIGHT);
		txtnumber.setText("0.0");
		txtnumber.setBounds(10, 10, 239, 26);
		
		Button btnC = new Button(shell, SWT.NONE);
		btnC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtnumber.setText("0.0");
				firstnumber = 0.0;
				secondNumber = 0.0;
				lastpress = "symbol";
			}
		});
		btnC.setText("C");
		btnC.setBounds(10, 42, 43, 30);
		
		Button btnsquare = new Button(shell, SWT.NONE);
		btnsquare.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				secondNumber = Double.parseDouble(txtnumber.getText());
				txtnumber.setText("" + (secondNumber * secondNumber));
				firstnumber = Double.parseDouble(txtnumber.getText());
				
				symbol = "square";
				newnumber = "new";
				lastpress = "symbol";
			}
		});
		btnsquare.setText("x^2");
		btnsquare.setBounds(59, 42, 43, 30);
		
		Button btnroot = new Button(shell, SWT.NONE);
		btnroot.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				secondNumber = Double.parseDouble(txtnumber.getText());
				txtnumber.setText("" + Math.sqrt(secondNumber));
				firstnumber = Double.parseDouble(txtnumber.getText());
				
				symbol = "square";
				newnumber = "new";
				lastpress = "symbol";
			}
		});
		btnroot.setText("\u221A");
		btnroot.setBounds(108, 42, 43, 30);
		
		Button btnpercentage = new Button(shell, SWT.NONE);
		btnpercentage.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				secondNumber = Double.parseDouble(txtnumber.getText());
				txtnumber.setText("" + (secondNumber /100));
				firstnumber = Double.parseDouble(txtnumber.getText());
				
				symbol = "square";
				newnumber = "new";
				lastpress = "symbol";
			}
		});
		btnpercentage.setText("%");
		btnpercentage.setBounds(157, 42, 43, 30);
		
		Button btnreciprocal = new Button(shell, SWT.NONE);
		btnreciprocal.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				secondNumber = Double.parseDouble(txtnumber.getText());
				txtnumber.setText("" + (1/ secondNumber));
				firstnumber = Double.parseDouble(txtnumber.getText());
				
				symbol = "square";
				newnumber = "new";
				lastpress = "symbol";
			}
		});
		btnreciprocal.setText("1/x");
		btnreciprocal.setBounds(206, 42, 43, 30);
		
		Button btnseven = new Button(shell, SWT.NONE);
		btnseven.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(newnumber != null)
				{
					txtnumber.setText("7");
					newnumber=null;
				}
				else
				{
				String equation=txtnumber.getText();
				txtnumber.setText(equation + "7");
				}
				secondNumber = Double.parseDouble(txtnumber.getText());
				lastpress = "number";
			}
		});
		btnseven.setText("7");
		btnseven.setBounds(10, 78, 43, 30);
		
		Button btneight = new Button(shell, SWT.NONE);
		btneight.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(newnumber != null)
				{
					txtnumber.setText("8");
					newnumber=null;
				}
				else
				{
				String equation=txtnumber.getText();
				txtnumber.setText(equation + "8");
				}
				secondNumber = Double.parseDouble(txtnumber.getText());
				lastpress = "number";
			}
		});
		btneight.setText("8");
		btneight.setBounds(59, 78, 43, 30);
		
		Button btnnine = new Button(shell, SWT.NONE);
		btnnine.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(newnumber != null)
				{
					txtnumber.setText("9");
					newnumber=null;
				}
				else
				{
				String equation=txtnumber.getText();
				txtnumber.setText(equation + "9");
				}
				secondNumber = Double.parseDouble(txtnumber.getText());
				lastpress = "number";
			}
		});
		btnnine.setText("9");
		btnnine.setBounds(108, 78, 43, 30);
		
		
		
		
		Button btnfour = new Button(shell, SWT.NONE);
		btnfour.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(newnumber != null)
				{
					txtnumber.setText("4");
					newnumber=null;
				}
				else
				{
				String equation=txtnumber.getText();
				txtnumber.setText(equation + "4");
				}
				secondNumber = Double.parseDouble(txtnumber.getText());
				lastpress = "number";
			}
		});
		btnfour.setText("4");
		btnfour.setBounds(10, 114, 43, 30);
		
		Button btnfive = new Button(shell, SWT.NONE);
		btnfive.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(newnumber != null)
				{
					txtnumber.setText("5");
					newnumber=null;
				}
				else
				{
				String equation=txtnumber.getText();
				txtnumber.setText(equation + "5");
				}
				secondNumber = Double.parseDouble(txtnumber.getText());
				lastpress = "number";
			}
		});
		btnfive.setText("5");
		btnfive.setBounds(59, 114, 43, 30);
		
		Button btnsix = new Button(shell, SWT.NONE);
		btnsix.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(newnumber != null)
				{
					txtnumber.setText("6");
					newnumber=null;
				}
				else
				{
				String equation=txtnumber.getText();
				txtnumber.setText(equation + "6");
				}
				secondNumber = Double.parseDouble(txtnumber.getText());
				lastpress = "number";
			}
		});
		btnsix.setText("6");
		btnsix.setBounds(108, 114, 43, 30);
	
		
		
		
		Button btnone = new Button(shell, SWT.NONE);
		btnone.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(newnumber != null)
				{
					txtnumber.setText("1");
					newnumber=null;
				}
				else
				{
				String equation=txtnumber.getText();
				txtnumber.setText(equation + "1");
				}
				secondNumber = Double.parseDouble(txtnumber.getText());
				lastpress = "number";
			}
		});
		btnone.setText("1");
		btnone.setBounds(10, 150, 43, 30);
		
		Button btntwo = new Button(shell, SWT.NONE);
		btntwo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(newnumber != null)
				{
					txtnumber.setText("2");
					newnumber=null;
				}
				else
				{
				String equation=txtnumber.getText();
				txtnumber.setText(equation + "2");
				}
				secondNumber = Double.parseDouble(txtnumber.getText());
				lastpress = "number";
			}
		});
		btntwo.setText("2");
		btntwo.setBounds(59, 150, 43, 30);
		
		Button btnthree = new Button(shell, SWT.NONE);
		btnthree.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(newnumber != null)
				{
					txtnumber.setText("3");
					newnumber=null;
				}
				else
				{
				String equation=txtnumber.getText();
				txtnumber.setText(equation + "3");
				}
				secondNumber = Double.parseDouble(txtnumber.getText());
				lastpress = "number";
			}
		});
		btnthree.setText("3");
		btnthree.setBounds(108, 150, 43, 30);
		
		Button btn0 = new Button(shell, SWT.NONE);
		btn0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(newnumber != null)
				{
					txtnumber.setText("0");
					newnumber=null;
				}
				else
				{
				String equation=txtnumber.getText();
				txtnumber.setText(equation + "0");
				}
				secondNumber = Double.parseDouble(txtnumber.getText());
				lastpress = "number";
			}
		});
		btn0.setText("0");
		btn0.setBounds(10, 186, 92, 30);
		
		Button btndot = new Button(shell, SWT.NONE);
		btndot.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(newnumber != null)
				{
					txtnumber.setText("0.");
					newnumber=null;
				}
				else
				{
				String equation=txtnumber.getText();
				txtnumber.setText(equation + ".");
				}
				secondNumber = Double.parseDouble(txtnumber.getText());
				lastpress = "number";
			}
		});
		btndot.setText(".");
		btndot.setBounds(108, 186, 43, 30);
		
		Button btnplus = new Button(shell, SWT.NONE);
		btnplus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(lastpress == "number")
				{
					if(symbol == "times")
					{
						txtnumber.setText("" + (firstnumber* secondNumber));
					}
					if(symbol == "plus")
					{
						txtnumber.setText("" + (firstnumber+ secondNumber));
					}
					if(symbol == "minus")
					{
						txtnumber.setText("" + (firstnumber- secondNumber));
					}
					if(symbol == "divide")
					{
						txtnumber.setText("" + (firstnumber/ secondNumber));
					}
				}
				firstnumber = Double.parseDouble(txtnumber.getText());
				symbol = "plus";
				newnumber = "new";
				lastpress = "symbol";
			}
		});
		btnplus.setText("+");
		btnplus.setBounds(157, 186, 43, 30);
		
		Button btndivide = new Button(shell, SWT.NONE);
		btndivide.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {				
				if(lastpress == "number")
				{
					if(symbol == "times")
					{
						txtnumber.setText("" + (firstnumber* secondNumber));
					}
					if(symbol == "plus")
					{
						txtnumber.setText("" + (firstnumber+ secondNumber));
					}
					if(symbol == "minus")
					{
						txtnumber.setText("" + (firstnumber- secondNumber));
					}
					if(symbol == "divide")
					{
						txtnumber.setText("" + (firstnumber/ secondNumber));
					}
				}
				firstnumber = Double.parseDouble(txtnumber.getText());
				
				symbol = "divide";
				newnumber = "new";
				lastpress = "symbol";
				
			}
		});
		btndivide.setText("/");
		btndivide.setBounds(157, 78, 43, 30);
		
		Button btntimes = new Button(shell, SWT.NONE);
		btntimes.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(lastpress == "number")
				{
					if(symbol == "divide")
					{
						txtnumber.setText("" + (firstnumber/ secondNumber));
					}
					if(symbol == "plus")
					{
						txtnumber.setText("" + (firstnumber+ secondNumber));
					}
					if(symbol == "minus")
					{
						txtnumber.setText("" + (firstnumber- secondNumber));
					}
					if(symbol == "times")
					{
						txtnumber.setText("" + (firstnumber* secondNumber));
					}
				}	
				firstnumber = Double.parseDouble(txtnumber.getText());
				
				symbol = "times";
				newnumber = "new";
				lastpress = "symbol";
			}
		});
		btntimes.setText("*");
		btntimes.setBounds(157, 114, 43, 30);
		
		Button btnminus = new Button(shell, SWT.NONE);
		btnminus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(lastpress == "number")
				{
					if(symbol == "times")
					{
						txtnumber.setText("" + (firstnumber* secondNumber));
					}
					if(symbol == "divide")
					{
						txtnumber.setText("" + (firstnumber/ secondNumber));
					}
					if(symbol == "plus")
					{
						txtnumber.setText("" + (firstnumber+ secondNumber));
					}		
					if(symbol == "minus")
					{
						txtnumber.setText("" + (firstnumber- secondNumber));
					}
				}
				firstnumber = Double.parseDouble(txtnumber.getText());
				
				symbol = "minus";
				newnumber = "new";
				lastpress = "symbol";
			
			}
		});
		btnminus.setText("-");
		btnminus.setBounds(157, 150, 43, 30);
		
		Button btnequal = new Button(shell, SWT.NONE);
		btnequal.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(symbol == "plus")
				{
					txtnumber.setText("" + (firstnumber+ secondNumber));
				}
				if(symbol == "divide")
				{
					txtnumber.setText("" + (firstnumber/ secondNumber));
				}
				if(symbol == "times")
				{
					txtnumber.setText("" + (firstnumber* secondNumber));
				}
				if(symbol == "minus")
				{
					txtnumber.setText("" + (firstnumber- secondNumber));
				}
				firstnumber = Double.parseDouble(txtnumber.getText());
				
				symbol = "equal";
		    	lastpress = "symbol";
		    	newnumber = "new";
				
			}
		});
		btnequal.setText("=");
		btnequal.setBounds(206, 78, 43, 138);

	}
}
