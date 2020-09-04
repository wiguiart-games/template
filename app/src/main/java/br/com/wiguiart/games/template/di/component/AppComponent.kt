package br.com.wiguiart.games.template.di.component

import android.app.Application
import br.com.wiguiart.games.template.TemplateApplication
import br.com.wiguiart.games.template.di.module.AppModule
import br.com.wiguiart.games.template.di.module.MainActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        MainActivityModule::class
    ]
)
interface AppComponent : AndroidInjector<TemplateApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    override  fun inject(app: TemplateApplication)
}