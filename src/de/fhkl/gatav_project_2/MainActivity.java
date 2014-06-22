package de.fhkl.gatav_project_2;

import de.fhkl.praktikum01_a1.R;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	//Button Click Events
	public void clicked(View v) {
		if (v.getId() == R.id.FHKLlink) {
			Uri adress = Uri.parse("http://www.fh-kl.de/");
			Intent intent = new Intent(Intent.ACTION_VIEW, adress);
			startActivity(intent);
		}

		if (v.getId() == R.id.button2) {
			Toast toast = Toast.makeText(this, "Ein Toast", Toast.LENGTH_LONG);
			toast.show();
		}
		if (v.getId() == R.id.button3) {
			Toast toast = Toast.makeText(this, "Ein Toast", Toast.LENGTH_LONG);
			toast.show();
		}
		if (v.getId() == R.id.button4) {
			Toast toast = Toast.makeText(this, "Ein Toast", Toast.LENGTH_LONG);
			toast.show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
	if(item.getItemId() == R.id.action_show_42)
		{
			Toast toast = Toast.makeText(this, "42", Toast.LENGTH_LONG);
			toast.show();
		}
	return true;
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
