import styles from "./NavigatePanel.module.css";

function NavigatePanel({imagem}){
    return(
        <section className ={styles.background}>
             <div 
                className={styles.banner}
                style={{backgroundImage : `url('/imagems/${imagem}.png')`}}
            >
            </div >

        </section>
    );

}



export default NavigatePanel;