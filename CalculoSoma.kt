class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       

        var botao = findViewById<Button>(R.id.button);
        var texto1 = findViewById<EditText>(R.id.editText6);
        var texto2 = findViewById<EditText>(R.id.editText7);

        var textoFinal = findViewById<TextView>(R.id.textView5)

        botao.setOnClickListener {


            var soma = texto1.text.toString().toDouble() + texto2.text.toString().toDouble()
            textoFinal.text = "SOMA =  $soma"
        }




    }
}
