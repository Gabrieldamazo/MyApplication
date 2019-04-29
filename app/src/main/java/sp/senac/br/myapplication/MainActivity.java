package sp.senac.br.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toobarMenuApp);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

    MenuInflater menuInflater=getMenuInflater();
    menuInflater.inflate(R.menu.menu_suporte,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
        case R.id.compartilhar:
        Toast.makeText(getApplicationContext(), "Compartilhar", Toast.LENGTH_SHORT).show();
        break;
            case R.id.cadastrar:
                Toast.makeText(getApplicationContext(),"Cadastrar", Toast.LENGTH_SHORT).show();break;
            case R.id.sobre:
                Toast.makeText(getApplicationContext(),"Sobre", Toast.LENGTH_SHORT).show();break;
            case R.id.mensagem:
                Toast.makeText(getApplicationContext(),"Mensagem", Toast.LENGTH_SHORT).show();break;
            case R.id.aviso:
                Toast.makeText(getApplicationContext(),"Aviso", Toast.LENGTH_SHORT).show();break;
            case R.id.ajuda:
                Toast.makeText(getApplicationContext(),"Ajuda", Toast.LENGTH_SHORT).show();break;
            case R.id.suporte:
                Toast.makeText(getApplicationContext(),"Suporte", Toast.LENGTH_SHORT).show();
    }
        return super.onOptionsItemSelected(item);
    }
}
