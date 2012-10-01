package com.first_task.web_math;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;

public class MyComposite extends CustomComponent {

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private AbsoluteLayout absoluteLayout_2;
	@AutoGenerated
	private Button button_3;
	@AutoGenerated
	private Button button_2;
	@AutoGenerated
	private Button button_1;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public MyComposite() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// absoluteLayout_2
		absoluteLayout_2 = buildAbsoluteLayout_2();
		mainLayout.addComponent(absoluteLayout_2, "top:80.0px;left:100.0px;");
		
		return mainLayout;
	}

	@AutoGenerated
	private AbsoluteLayout buildAbsoluteLayout_2() {
		// common part: create layout
		absoluteLayout_2 = new AbsoluteLayout();
		absoluteLayout_2.setImmediate(false);
		absoluteLayout_2.setWidth("849px");
		absoluteLayout_2.setHeight("544px");
		absoluteLayout_2.setMargin(true);
		
		// button_1
		button_1 = new Button();
		button_1.setCaption("Button");
		button_1.setImmediate(true);
		button_1.setWidth("-1px");
		button_1.setHeight("-1px");
		absoluteLayout_2.addComponent(button_1, "top:20.0px;left:114.0px;");
		
		// button_2
		button_2 = new Button();
		button_2.setCaption("Button");
		button_2.setImmediate(true);
		button_2.setWidth("-1px");
		button_2.setHeight("-1px");
		absoluteLayout_2.addComponent(button_2, "top:20.0px;left:214.0px;");
		
		// button_3
		button_3 = new Button();
		button_3.setCaption("Button");
		button_3.setImmediate(true);
		button_3.setWidth("-1px");
		button_3.setHeight("-1px");
		absoluteLayout_2.addComponent(button_3, "top:20.0px;left:315.0px;");
		
		return absoluteLayout_2;
	}

}