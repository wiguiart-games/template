package br.com.wiguiart.games.template.di

import br.com.wiguiart.games.template.FirstFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeFirstFragment(): FirstFragment
}