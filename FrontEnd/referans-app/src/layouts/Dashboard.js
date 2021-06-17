import React from 'react'
import 'semantic-ui-css/semantic.min.css'
import Personals from '../pages/Personals'
import Categories from './Categories'
import Navi from './Navi'

export default function Dashboard() {
    return (
        <div>
           
           <Categories/>
           <Personals/>
        </div>
    )
}
