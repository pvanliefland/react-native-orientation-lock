import React, {Component} from 'react';
import {StyleSheet, Text, View, DeviceEventEmitter} from 'react-native';
import {OrientationLock} from 'react-native-orientation-lock';

export default class Example extends Component {
    constructor(props) {
        super(props);

        this.state = {
            lock: null
        }
    }

    render() {
        return (
            <View style={styles.container}>
                <Text style={styles.data}>Lock: {this.state.lock ? this.state.lock : 'None'}</Text>
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#F5FCFF',
    },
    data: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
    }
});