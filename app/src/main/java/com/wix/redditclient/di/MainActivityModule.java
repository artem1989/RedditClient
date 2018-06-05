package com.wix.redditclient.di;

import com.wix.redditclient.MainRedditFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
@SuppressWarnings("unused")
public abstract class MainActivityModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract MainRedditFragment providesMainRedditFragment();

//    @FragmentScoped
//    @ContributesAndroidInjector
//    abstract DetailsFragment providesDetailsFragment();
}
