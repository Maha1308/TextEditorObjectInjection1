package com.edu;

public class TextEditor {
	private SpellCheck spell;


	public SpellCheck getSpell() {
		return spell;
	}


	public void setSpell(SpellCheck spell) {
		this.spell = spell;
	}


	public void textFunction()
	{
		if(spell!=null)
		{

spell.enable();

		}
		else
		{
			System.out.println("spellcheck is disable");
		}
	}

}
