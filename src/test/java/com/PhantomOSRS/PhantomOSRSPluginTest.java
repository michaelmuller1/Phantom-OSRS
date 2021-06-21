package com.PhantomOSRS;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PhantomOSRSPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PhantomOSRSPlugin.class);
		RuneLite.main(args);
	}
}