package com.misurtii.certificacion.interactions.choucair;

import com.misurtii.certificacion.interactions.choucair.builders.SwipeBuilderFrom;
import net.serenitybdd.screenplay.Actor;

public class Swipe {
	
	public static SwipeBuilderFrom as (Actor actor) {
		return new SwipeBuilderFrom(actor);
	}
}
