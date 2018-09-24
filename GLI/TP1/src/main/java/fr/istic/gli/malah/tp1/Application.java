package fr.istic.gli.malah.tp1;

import fr.istic.gli.malah.tp1.adapter.TitleAdapter;
import fr.istic.gli.malah.tp1.adapter.impl.TitleAdapterImpl;
import fr.istic.gli.malah.tp1.controller.CamembertController;
import fr.istic.gli.malah.tp1.controller.impl.CamembertControllerImpl;
import fr.istic.gli.malah.tp1.model.Title;
import fr.istic.gli.malah.tp1.view.CamembertView;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridLayout;

public class Application {

    private static final PodamFactory FACTORY = new PodamFactoryImpl();

    public static void main(String... args) {
        Application application = new Application();
        application.init();
    }

    public void init() {
        Title title = FACTORY.manufacturePojoWithFullData(Title.class);
        TitleAdapter titleAdapter = new TitleAdapterImpl(title);
        CamembertView view = new CamembertView(titleAdapter);
        new CamembertControllerImpl(titleAdapter, view);
        initFrame(view);
    }

    private JFrame initFrame(JComponent component) {
        JFrame window = new JFrame();
        window.setMinimumSize(new Dimension(1200, 600));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 400, 400);
        GridLayout layout = new GridLayout(1, 2);
        window.getContentPane().add(component);
//        window.getContentPane().add(table);
//        window.getContentPane().add(addButton)

        window.setLayout(layout);
        window.pack();
        window.setVisible(true);
        window.pack();
        return window;
    }
}
