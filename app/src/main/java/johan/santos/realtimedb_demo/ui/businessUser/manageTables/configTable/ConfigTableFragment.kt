package johan.santos.realtimedb_demo.ui.businessUser.manageTables.configTable

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import johan.santos.realtimedb_demo.R

class ConfigTableFragment : Fragment() {

    companion object {
        fun newInstance() = ConfigTableFragment()
    }

    private lateinit var viewModel: ConfigTableViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.config_table_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ConfigTableViewModel::class.java)
        // TODO: Use the ViewModel
    }

}