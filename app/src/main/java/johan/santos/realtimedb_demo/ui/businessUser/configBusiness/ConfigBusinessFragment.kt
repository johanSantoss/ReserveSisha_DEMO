package johan.santos.realtimedb_demo.ui.businessUser.configBusiness

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import johan.santos.realtimedb_demo.R

class ConfigBusinessFragment : Fragment() {

    companion object {
        fun newInstance() = ConfigBusinessFragment()
    }

    private lateinit var viewModel: ConfigBusinessViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.config_business_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ConfigBusinessViewModel::class.java)
        // TODO: Use the ViewModel
    }

}