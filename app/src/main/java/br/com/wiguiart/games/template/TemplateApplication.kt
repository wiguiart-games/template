package br.com.wiguiart.games.template

import android.content.Context
import androidx.multidex.MultiDex
import br.com.wiguiart.games.template.di.AppInjector
import br.com.wiguiart.games.template.di.component.DaggerAppComponent
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


/**
 * Classe correspondente ao objeto de aplicação do app
 *
 * Essa classe é uma versão customizada do objeto de aplicação (Application) do app.
 * Ela pode armazenar valores e variáveis de uso comum, uma vez que o ciclo de vida desse objeto
 * corresponde quase que integralmente ao ciclo de vida do App
 *
 * @since 1.0
 */
class TemplateApplication : DaggerApplication()  {

    private val applicationInjector = DaggerAppComponent.builder().application(this).build()
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = applicationInjector


    lateinit var firebaseAnalytics: FirebaseAnalytics
        private set

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
        AppInjector.init(this)
    }

    /**
     * Método onCreate do ciclo de vida da Application
     *
     * Método que é parte do ciclo de vida do Android. Executado apenas uma vez durante o
     * ciclo de vida do app, é ideal para iniciar objetos de uso generalizado no app
     *
     * @since 1.0
     */
    override fun onCreate() {
        super.onCreate()

        firebaseAnalytics = Firebase.analytics
    }
}