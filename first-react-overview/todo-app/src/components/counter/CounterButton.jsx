import './Counter.css'

export default function CounterButton({by,incrementCounterParentFunction,decrementCounterParentFunction}) {

    return (
        <div className="Counter">
            <div>
                <button 
                    className="counterButton blue" 
                    onClick={() => incrementCounterParentFunction(by)}                    
                > +{by}</button>
                <button 
                    className="counterButton red" 
                    onClick={() => decrementCounterParentFunction(by)}                    
                > -{by}</button>
            </div>
        </div>
    )
}

