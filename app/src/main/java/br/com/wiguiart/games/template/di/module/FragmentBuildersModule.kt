package br.com.wiguiart.games.template.di.module

import br.com.wiguiart.games.template.presentation.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeFirstFragment(): MainFragment
}